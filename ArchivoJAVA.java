
public class ArchivoJAVA {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un número entero");
    int primerNumero = Integer.parseInt(sc.next());

    System.out.println("Introduzca otro número entero");
    int segundoNumero = Integer.parseInt(sc.next());

    int suma = primerNumero + segundoNumero;
    
    System.out.println("La suma de ambos números es: " + suma);

  }

}
