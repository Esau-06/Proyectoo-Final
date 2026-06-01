import java.util.Scanner;

public class Validaciones {

    public int ValidarEntero(Scanner sc) {

        if (!sc.hasNextInt()) {
            System.out.println("Error: debe ingresar un numero entero");
            sc.next();
            return ValidarEntero(sc);
        }

        int numero = sc.nextInt();
        return numero;
    }

    public int ValidarEnteroRango(Scanner sc, int minimo, int maximo) {

        int numero = ValidarEntero(sc);

        if (numero < minimo || numero > maximo) {
            System.out.println("Error: debe ingresar una opcion entre " + minimo + " y " + maximo);
            return ValidarEnteroRango(sc, minimo, maximo);
        }

        return numero;
    }

    public float ValidarDecimal(Scanner sc) {

        if (!sc.hasNextFloat()) {
            System.out.println("Error: debe ingresar un numero decimal");
            sc.next();
            return ValidarDecimal(sc);
        }

        float numero = sc.nextFloat();
        return numero;
    }

    public float ValidarDecimalRango(Scanner sc, float minimo, float maximo) {

        float numero = ValidarDecimal(sc);

        if (numero < minimo || numero > maximo) {
            System.out.println("Error: debe ingresar un valor entre " + minimo + " y " + maximo);
            return ValidarDecimalRango(sc, minimo, maximo);
        }

        return numero;
    }

    public String ValidarTexto(Scanner sc) {

        String texto = sc.next();

        if (texto.length() < 2 || texto.length() > 30) {
            System.out.println("Error: el texto debe tener entre 2 y 30 caracteres");
            return ValidarTexto(sc);
        }

        if (!EsTexto(texto)) {
            System.out.println("Error: solo se permiten letras");
            return ValidarTexto(sc);
        }

        return texto;
    }

    public String ValidarCedula(Scanner sc) {

        String cedula = sc.next();

        if (cedula.length() != 10) {
            System.out.println("Error: la cedula debe tener exactamente 10 numeros");
            return ValidarCedula(sc);
        }

        if (!EsNumero(cedula)) {
            System.out.println("Error: la cedula solo debe contener numeros");
            return ValidarCedula(sc);
        }

        return cedula;
    }

    public String ValidarTelefono(Scanner sc) {

        String telefono = sc.next();

        if (telefono.length() != 10) {
            System.out.println("Error: el telefono debe tener exactamente 10 numeros");
            return ValidarTelefono(sc);
        }

        if (!EsNumero(telefono)) {
            System.out.println("Error: el telefono solo debe contener numeros");
            return ValidarTelefono(sc);
        }

        return telefono;
    }

    public String ValidarSerialTexto(Scanner sc) {

        String serial = sc.next();

        if (serial.length() < 3 || serial.length() > 15) {
            System.out.println("Error: el serial debe tener entre 3 y 15 caracteres");
            return ValidarSerialTexto(sc);
        }

        if (!EsAlfanumerico(serial)) {
            System.out.println("Error: el serial solo debe tener letras y numeros");
            return ValidarSerialTexto(sc);
        }

        return serial;
    }

    public int ValidarSerialNumerico(Scanner sc) {

        int serial = ValidarEntero(sc);

        if (serial <= 0) {
            System.out.println("Error: el serial debe ser mayor que cero");
            return ValidarSerialNumerico(sc);
        }

        return serial;
    }

    public boolean EsNumero(String dato) {

        for (int i = 0; i < dato.length(); i++) {

            if (dato.charAt(i) < '0' || dato.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public boolean EsTexto(String dato) {

        for (int i = 0; i < dato.length(); i++) {

            char letra = dato.charAt(i);

           if (!((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z') || letra == 'ñ' || letra == 'Ñ' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú' || letra == 'Á' || letra == 'É' || letra == 'Í' || letra == 'Ó' || letra == 'Ú')) {
            }
        }

        return true;
    }

    public boolean EsAlfanumerico(String dato) {

        for (int i = 0; i < dato.length(); i++) {

            char letra = dato.charAt(i);

            if (!((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z') || (letra >= '0' && letra <= '9') || letra == 'ñ' || letra == 'Ñ' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú' || letra == 'Á' || letra == 'É' || letra == 'Í' || letra == 'Ó' || letra == 'Ú')) {
                return false;
            }
        }

        return true;
    }
}