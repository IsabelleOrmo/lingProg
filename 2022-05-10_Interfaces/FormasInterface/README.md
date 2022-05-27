# Uso de interfaces

---

Interfaces são usadas para, literalmente, realizar a *interface*, uma ponte, entre o programa e o mundo exterior.
Age como um contrato, que define o que pode ser realizado dentro da classe.

Todos os seus métodos **devem** ser abstratos, portanto, não devem ter a implementação.
Não possui atributos.

> Interfaces agem como um "contrato" entre o mundo exterior e o programa. Tal como um contrato, tem suas exigências: **seus métodos devem sempre ser implementados.**

Como seus métodos são abstratos, quando uma interface é *implementada*, seus métodos devem receber implementação dentro do programa.
Uma interface é "herdada" a partir da palavra `implements`.

```java
public interface AreaCalculavel {
    private double calcularArea(); // Sem implementação!
}

public class Retangulo implements AreaCalculavel {
    private double lado1, lado2; 

    private double calcularArea() { // A implementação é realizada dentro da classe
        return lado1 * lado2;
    }
}

public class Circulo implements AreaCalculavel {
    private double raio; 

    private double calcularArea() { // A implementação é realizada dentro da classe, toda a vez. 
        return Math.PI * (raio * raio);
    }
}
```

## Herança múltipla

Interfaces permitem a simulação de uma "herança múltipla".
Em java, só são permitidas heranças únicas: uma classe só pode herdar de uma classe Pai.

Portanto, com interfaces, que não são classes e não realizam heranças, pode-se realizar algo parecido com a herança múltipla.
Múltiplas interfaces podem ser implementadas em uma única classe.

```java
public class Imoveis implements imobiliaria, contrato {
    // Várias interfaces podem ser chamadas!
}
```

## Interfaces e polimorfismo

Embora não seja possível criar instâncias de uma interface, é possível realizar o polimorfismo.
Assim, a interface recebe uma instância com as implementações de seus métodos.

```java
AreaCalculavel a1 = new Quadrado();
AreaCalculavel a2 = new Circulo();
```

---

(13/05)

### Assunto final da aula de interfaces

Nesse caso, não é possível acessar os getters e setters de `Quadrado()` e `Circulo()`, já que AreaCalculavel não os tem.
Portanto, o ideal é realizar um casting para acessar, ou, atribuir pelo construtor, assim, os métodos de cálculo de área poderão acessar o valor do lado e do raio.

```java
AreaCalculavel a1 = new Quadrado(lado: 10);
AreaCalculavel a2 = new Circulo(raio: 15);

// As variáveis locais foram atribuídas nos construtores.

System.out.println("Área do quadrado:  " + a1.calcularArea());
System.out.println("Área do círculo:  " + a2.calcularArea()); 

// O cálculo funcionará perfeitamente para ambos os casos, usando a variável e segundo os métodos calcularArea da interface, cuja implementação foi definida dentro das classes Quadrado e Circulo.
```
