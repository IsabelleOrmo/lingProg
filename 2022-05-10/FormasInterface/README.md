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
