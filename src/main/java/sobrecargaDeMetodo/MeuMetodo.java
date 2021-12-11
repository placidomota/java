package sobrecargaDeMetodo;

/*dois métodos que adicionam números de tipos diferentes
public class MeuMetodo {
    static int primeiroMetodoInt(int x , int y) {
        return x + y;
    }
    static double primeiroMetodoDouble(double x , double y) {
        return x + y ;
    }
    public static void main(String[] args)  {
        int myNum1 = primeiroMetodoInt(8,1);
        double myNum2 = primeiroMetodoDouble(5.6 , 6.5);
        System.out.println("Inteiro:" + myNum1);
        System.out.println("Double:" + myNum2);

    }
}
*/

// Em vez de definir dois métodos que devem fazer a mesma coisa, é melhor sobrecarregar um.
//No exemplo abaixo, sobrecarregamos o plusMethod método para funcionar para ambos int e double:
class MeuMetodo {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}


