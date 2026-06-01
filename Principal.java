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

                    while (opcionIngenieria != 4) {

                        System.out.println("MENU ESTUDIANTES DE INGENIERIA");
                        System.out.println("0. Registrar prestamo");
                        System.out.println("1. Modificar prestamo");
                        System.out.println("2. Devolucion de equipo");
                        System.out.println("3. Buscar equipo");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Digite una opcion");

                        opcionIngenieria = v.ValidarEnteroRango(sc, 0, 4);

                        switch (opcionIngenieria) {

                            case 0:
                                m.RegistrarPrestamoIngenieria();
                                break;

                            case 1:
                                m.ModificarPrestamoIngenieria();
                                break;

                            case 2:
                                m.DevolverEquipoIngenieria();
                                break;

                            case 3:
                                m.BuscarEquipoIngenieria();
                                break;

                            case 4:
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

                    while (opcionDiseño != 4) {

                        System.out.println("MENU ESTUDIANTES DE DISEÑO");
                        System.out.println("0. Registrar prestamo");
                        System.out.println("1. Modificar prestamo");
                        System.out.println("2. Devolucion de equipo");
                        System.out.println("3. Buscar equipo");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Digite una opcion");

                        opcionDiseño = v.ValidarEnteroRango(sc, 0, 4);

                        switch (opcionDiseño) {

                            case 0:
                                m.RegistrarPrestamoDiseño();
                                break;

                            case 1:
                                m.ModificarPrestamoDiseño();
                                break;

                            case 2:
                                m.DevolverEquipoDiseño();
                                break;

                            case 3:
                                m.BuscarEquipoDiseño();
                                break;

                            case 4:
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