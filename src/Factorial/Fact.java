package Factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(Suma(1,4));
        System.out.println(Multiplicacion(2,4));
    }
    public static int Sucesora (int n){
        return n+1;
    }

    public static int Suma (int x, int y){
        int resultado=x;
        for (int i = 0; i < y; i++) {
            resultado=Sucesora(resultado);
        }
        return resultado;
    }

    public static int Multiplicacion (int x, int y){
        int resultado=0;
        for (int i = 0; i < y; i++) {
            resultado=Suma(resultado,x);
        }
        return resultado;
    }
}
