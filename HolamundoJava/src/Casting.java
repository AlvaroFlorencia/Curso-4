public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
        //ESIMACIÓN
        int estimatedMonthlyDogs = ( int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);


        double c = a / b;
        System.out.println(c);
        char n='1';
        int n1 =n;
        System.out.println(n1);
         short nS = (short) n;
        System.out.println(nS);

    }
}
