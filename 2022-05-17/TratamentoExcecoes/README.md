# Tratamento de execeções

Existem dois tipos de erro:

* **Compile-time:** São erros que ocorrem na compilação do programa;
  * Falta de um ponto e vírgula, fecha parênteses, chaves erradas, nome de um método escrito errado.
  * A mais comum é a `NULL pointer exception`.
* **Runtime:** Erros ocorridos durante a execução do programa, por erros de programação ou inputs de usuários inválidos;
  * Passar uma letra para o valor de um inteiro, chamar uma variável não inicializada.

Deve ser usado para melhorar a usabilidade do programa e possibilitar maior robustez lidando com os erros do programa.

---

## Uso

```java
try {
    // Código vunerável a ser executado;
} catch {
    // Código a ser executado em caso de erros;
} finally {
    // Código a ser executado indepente de erros;
}
```
