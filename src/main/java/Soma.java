//classe que retorna a soma de dois paramentros de um metodo

public class Soma {
    static int soma(int num1 , int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int resultado = soma(5,6); // armazenando o resultado em uma variável
        System.out.println(resultado);
    }
}
