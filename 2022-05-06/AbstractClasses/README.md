# Classes abstratas

Uma classe abstrata pode ser usada para implementar atributos e métodos que serão genéricos a diversas outras classes por via do *extends*, e seu construtor não pode ser chamado, assim, impedindo a criação de objetos dessa classe, portanto, instâncias. 

É útil para uso em polimofismo, onde o construtor de uma classe filha, com métodos sobreescritos e construtor próprio, pode ser acessado e um objeto abstrato se torna a instância de uma filha. 

É importante lembrar que polimorfismo só aceita métodos sobreescritos, portanto, comuns a ambos. 
Casting em estruturas de repetição pode ser usado para "recuperar" o objeto na sua forma mais específica, permitindo acesso a métodos e atributos exclusivos a sua classe. 

> Classes abstrastas são usadas para *impedir instâncias*. 

### Métodos abstratos

