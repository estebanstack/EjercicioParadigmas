package euclides;

public class Main {
    public static void main(String[] args) {
        int a=4, b=12;
        System.out.println("El maximo comun divisor entre "+a+" y "+b+" es: "+mcd(a,b));
        int mcm=(a*b)/mcd(a,b);
        System.out.println("Por lo tanto el minimo comun multiplo es: "+ mcm);
    }

    public static int mcd(int a, int b){
        int m;
        if(a==b){
            m=a;
        }else{
            if(a<b){
                m=mcd(a,b-a);
            } else{
                m=mcd(a-b,b);
            }
        }
        return m;
    }
}
