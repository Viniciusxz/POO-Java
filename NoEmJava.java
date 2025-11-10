public class NoEmJava {
    int valor;
    NoEmJava esquerda;
    NoEmJava direita;

    public NoEmJava(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    } 

    public static void main(String[] args) {
        NoEmJava no = new NoEmJava(10);
        System.out.println("Valor do nó: " + no.valor);
    
    }
}