import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("GESTION PRESTAMO EQUIPOS ELECTRONICOS SAN JUAN DE DIOS");
            System.out.println("1. Estudiantes de Ingenieria");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir del programa");
            System.out.println("Digite una opcion");

            opcion = v.ValidarEnteroRango(sc, 1, 4);

            switch (opcion) {

                case 1:

                    int opcionIngenieria = 0;

                    while (opcionIngenieria != 5) {

                        System.out.println("MENU ESTUDIANTES DE INGENIERIA");
                        System.out.println("1. Registrar prestamo");
                        System.out.println("2. Modificar prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");
                        System.out.println("Digite una opcion");

                        opcionIngenieria = v.ValidarEnteroRango(sc, 1, 5);

                        switch (opcionIngenieria) {

                            case 1:
                                m.RegistrarPrestamoIngenieria();
                                break;

                            case 2:
                                m.ModificarPrestamoIngenieria();
                                break;

                            case 3:
                                m.DevolverEquipoIngenieria();
                                break;

                            case 4:
                                m.BuscarEquipoIngenieria();
                                break;

                            case 5:
                                System.out.println("Volviendo al menu principal");
                                break;

                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                    break;

                case 2:

                    int opcionDiseño = 0;

                    while (opcionDiseño != 5) {

                        System.out.println("MENU ESTUDIANTES DE DISEÑO");
                        System.out.println("1. Registrar prestamo");
                        System.out.println("2. Modificar prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");
                        System.out.println("Digite una opcion");

                        opcionDiseño = v.ValidarEnteroRango(sc, 1, 5);

                        switch (opcionDiseño) {

                            case 1:
                                m.RegistrarPrestamoDiseño();
                                break;

                            case 2:
                                m.ModificarPrestamoDiseño();
                                break;

                            case 3:
                                m.DevolverEquipoDiseño();
                                break;

                            case 4:
                                m.BuscarEquipoDiseño();
                                break;

                            case 5:
                                System.out.println("Volviendo al menu principal");
                                break;

                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }

                    break;

                case 3:
                    m.ImprimirInventarioTotal();
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}