import java.util.Scanner;

public class Validaciones {

    public int ValidarEntero(Scanner sc) {

        if (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
            return ValidarEntero(sc);
        }

        int numero = sc.nextInt();
        sc.nextLine();

        return numero;
    }

    public float ValidarDecimal(Scanner sc) {

        if (!sc.hasNextFloat()) {
            System.out.println("Por favor digite un numero decimal");
            sc.nextLine();
            return ValidarDecimal(sc);
        }

        float numero = sc.nextFloat();
        sc.nextLine();

        return numero;
    }

    public String ValidarTexto(Scanner sc) {

        String texto = sc.nextLine();

        if (texto.equals("")) {
            System.out.println("El campo no puede estar vacio");
            return ValidarTexto(sc);
        }

        if (!texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            System.out.println("No se permiten numeros ni caracteres especiales");
            return ValidarTexto(sc);
        }

        return texto;
    }

    public String ValidarCedula(Scanner sc) {

        String cedula = sc.nextLine();

        if (!cedula.matches("[0-9]+")) {
            System.out.println("La cedula solo debe tener numeros");
            return ValidarCedula(sc);
        }

        return cedula;
    }
}