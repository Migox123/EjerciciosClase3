public class App {
    public static void main(String[] args) throws Exception {
        byte numeroPequeño = 100;
        short numeroMediano =  10000; // inicializando
        int numeroGrande ; // declarando

        var numeroMuyGrande = 10000; // java escoge el tipo de dato necesario para almacenar el valor
        var n1 = 34;

        long numeroEnorme = 10000l ;

        var numeroFlotante= 3.14f; // tipo flotante
        float numeroFlotante2 = 3.14f; // tipo flotante

        var numeroDouble = 3.14515145415141d; // tipo double
        double numeroDouble2 = 3.14515145415141d; // tipo double

        boolean verdadero = true;
        boolean falso = false;
        boolean esMayor = n1 > 18;

        char caracter = 'a'; // tipo caracter
        char caracterEspecial = '\u0041'; // tipo caracter con valor unicode

        System.out.println("este es : " + caracterEspecial);

        String nombre = "Juan"; // tipo cadena de texto
        System.out.println("Hola " + nombre + " tu edad es: " + n1);

        String nombre2 = "Miguel Holguin";
        System.out.println("Hola " + nombre2 + " tu edad es: " + n1);

        double a = 3.14;
        double b = 2.14;

        var resultadoDivision = a / b;
        System.out.println("El resultado de la division es: " + resultadoDivision);








    }
}
