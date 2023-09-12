public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo número precisa ser maior que o primeiro");
    }
}