/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    private ArrayList<Aluno> lstAluno;
    private static AlunoControl inst;
    private final AlunoDAO DAO;
    
    private AlunoControl() throws SQLException {
        lstAluno = new ArrayList<Aluno>();
        DAO = AlunoDAO.getInstance();
    }
    
    public static AlunoControl getInstance() throws SQLException {
        if (inst == null) {
            inst = new AlunoControl();
        }
        
        return inst;
    }
    
    public DefaultTableModel setModel() {
        DefaultTableModel data = new DefaultTableModel();
        data.setNumRows(0);
        data.addColumn("ID");
        data.addColumn("Nome");
        data.addColumn("RA");
        
        for (Aluno al : lstAluno) {
           data.addRow(new Object[]{lstAluno.indexOf(al), al.getNome(), Integer.toString(al.getRa())});
        }
        
        return data;
    }
    
    public boolean cadastrarAluno (int ra, String nome) {
        try {
            Aluno al = new Aluno(ra, nome);
            DAO.insertAluno(al);
            lstAluno.add(al);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<Aluno> toList() {
        return this.lstAluno;
    }   
    
    public Optional<Aluno> buscaRA(int ra) {
        for (Aluno al : lstAluno) {
            if (al.getRa() == ra)
                return Optional.of(al);
        }
        
        return Optional.empty();
    }
    
    public Optional<Aluno> buscaNome(String nome) {
        for (Aluno al : lstAluno) {
            if (al.getNome() == nome)
                return Optional.of(al);
        }
        
        return Optional.empty();
    }
    
    public boolean removerNome(String nome) {
        return lstAluno.remove(buscaNome(nome).get());
    }
    
    public void removerRA(int ra) throws SQLException {
        try {
            lstAluno.remove(buscaRA(ra).get());
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Impossível remover:  RA não encontrado.");
        }

        try {
            DAO.removeAluno(ra);
        } catch (SQLException e) {
            throw new SQLException("Houve um erro na conexão SQL:  " + e.getMessage());
        }
    }
}
