/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoDAO {
    private Connection sqlConnection;
    private static AlunoDAO alunoDAO;
    
    private AlunoDAO(Connection sqlConnection) throws SQLException {
        this.sqlConnection = sqlConnection;
    }
    
    private AlunoDAO() throws SQLException {
        this(Connect.ConnectionManager.getConnection());
    }
    
    public static AlunoDAO getInstance() throws SQLException {
        if (alunoDAO == null)
            alunoDAO = new AlunoDAO();
        
        return alunoDAO;
    }
    
    
    public void insertAluno(Aluno aluno) throws SQLException {
        PreparedStatement smt = (PreparedStatement) sqlConnection.prepareStatement("INSERT INTO TJavaAluno(RA, Nome) values (?, ?)");

        smt.setInt(1, aluno.getRa());
        smt.setString(2, aluno.getNome());
        smt.execute();
        smt.close();
    }

    public void removeAluno(String ra) throws SQLException, IllegalArgumentException {
        final int iRA = Aluno.checkRA(ra);

        PreparedStatement smt = (PreparedStatement) sqlConnection.prepareStatement("DELETE FROM TJavaAluno WHERE RA = ?");
        
        smt.setInt(1, iRA);
        smt.execute();
        smt.close();
    }
}
