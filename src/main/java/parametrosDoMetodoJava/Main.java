package parametrosDoMetodoJava;

public class Main {
    static void verificaIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Pode votar");
        }else {
            System.out.println("Não pode Votar");
        }
    }
    public static void main(String[] args) {
        verificaIdade(22);
    }
}
