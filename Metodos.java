import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public void RegistrarPrestamoIngenieria() {

        EstudianteIngenieria e = new EstudianteIngenieria();
        ComputadorPortatil c = new ComputadorPortatil();

        System.out.println("REGISTRAR PRESTAMO INGENIERIA");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        System.out.println("Ingrese nombre del estudiante");
        e.setNombre(sc.next());

        System.out.println("Ingrese apellido del estudiante");
        e.setApellido(sc.next());

        System.out.println("Ingrese telefono del estudiante");
        e.setTelefono(sc.next());

        System.out.println("Ingrese numero de semestre");
        e.setNumeroSemestre(sc.nextInt());

        System.out.println("Ingrese promedio acumulado");
        e.setPromedioAcumulado(sc.nextFloat());

        System.out.println("Ingrese serial del computador");
        c.setSerial(sc.next());

        e.setSerialEquipo(c.getSerial());

        System.out.println("Ingrese marca del computador");
        c.setMarca(sc.next());

        System.out.println("Ingrese tamaño del computador");
        c.setTamano(sc.nextFloat());

        System.out.println("Ingrese precio del computador");
        c.setPrecio(sc.nextFloat());

        System.out.println("Ingrese sistema operativo");
        c.setSistemaOperativo(sc.next());

        System.out.println("Ingrese procesador");
        c.setProcesador(sc.next());

        System.out.println("Prestamo de ingenieria registrado correctamente");
    }

    public void RegistrarPrestamoDiseño() {

        EstudianteDiseño e = new EstudianteDiseño();
        TabletaGrafica t = new TabletaGrafica();

        System.out.println("REGISTRAR PRESTAMO DISEÑO");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        System.out.println("Ingrese nombre del estudiante");
        e.setNombre(sc.next());

        System.out.println("Ingrese apellido del estudiante");
        e.setApellido(sc.next());

        System.out.println("Ingrese telefono del estudiante");
        e.setTelefono(sc.next());

        System.out.println("Ingrese modalidad de estudio");
        e.setModalidadEstudio(sc.next());

        System.out.println("Ingrese cantidad de asignaturas");
        e.setCantidadAsignaturas(sc.nextInt());

        System.out.println("Ingrese serial de la tableta");
        e.setSerialEquipo(sc.nextInt());

        t.setSerial(e.getSerialEquipo() + "");

        System.out.println("Ingrese marca de la tableta");
        t.setMarca(sc.next());

        System.out.println("Ingrese tamaño de la tableta");
        t.setTamano(sc.nextFloat());

        System.out.println("Ingrese precio de la tableta");
        t.setPrecio(sc.nextFloat());

        System.out.println("Ingrese almacenamiento");
        t.setAlmacenamiento(sc.next());

        System.out.println("Ingrese peso de la tableta");
        t.setPeso(sc.nextFloat());

        System.out.println("Prestamo de diseño registrado correctamente");
    }

    public void ModificarPrestamoIngenieria() {

        EstudianteIngenieria e = new EstudianteIngenieria();

        System.out.println("MODIFICAR PRESTAMO INGENIERIA");

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("Que desea modificar");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Telefono");
            System.out.println("4. Numero de semestre");
            System.out.println("5. Promedio acumulado");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese nuevo nombre");
                    e.setNombre(sc.next());
                    break;

                case 2:
                    System.out.println("Ingrese nuevo apellido");
                    e.setApellido(sc.next());
                    break;

                case 3:
                    System.out.println("Ingrese nuevo telefono");
                    e.setTelefono(sc.next());
                    break;

                case 4:
                    System.out.println("Ingrese nuevo numero de semestre");
                    e.setNumeroSemestre(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Ingrese nuevo promedio acumulado");
                    e.setPromedioAcumulado(sc.nextFloat());
                    break;

                case 6:
                    System.out.println("Saliendo de modificar");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

        System.out.println("La cedula y el serial no se modifican");
    }

    public void ModificarPrestamoDiseño() {

        EstudianteDiseño e = new EstudianteDiseño();

        System.out.println("MODIFICAR PRESTAMO DISEÑO");

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("Que desea modificar");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Telefono");
            System.out.println("4. Modalidad de estudio");
            System.out.println("5. Cantidad de asignaturas");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese nuevo nombre");
                    e.setNombre(sc.next());
                    break;

                case 2:
                    System.out.println("Ingrese nuevo apellido");
                    e.setApellido(sc.next());
                    break;

                case 3:
                    System.out.println("Ingrese nuevo telefono");
                    e.setTelefono(sc.next());
                    break;

                case 4:
                    System.out.println("Ingrese nueva modalidad de estudio");
                    e.setModalidadEstudio(sc.next());
                    break;

                case 5:
                    System.out.println("Ingrese nueva cantidad de asignaturas");
                    e.setCantidadAsignaturas(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Saliendo de modificar");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

        System.out.println("La cedula y el serial no se modifican");
    }

    public void DevolverEquipoIngenieria() {

        EstudianteIngenieria e = new EstudianteIngenieria();
        ComputadorPortatil c = new ComputadorPortatil();

        System.out.println("DEVOLUCION EQUIPO INGENIERIA");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        System.out.println("Ingrese serial del computador");
        c.setSerial(sc.next());

        System.out.println("Devolucion de equipo de ingenieria registrada correctamente");
    }

    public void DevolverEquipoDiseño() {

        EstudianteDiseño e = new EstudianteDiseño();
        TabletaGrafica t = new TabletaGrafica();

        System.out.println("DEVOLUCION EQUIPO DISEÑO");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        System.out.println("Ingrese serial de la tableta");
        e.setSerialEquipo(sc.nextInt());

        t.setSerial(e.getSerialEquipo() + "");

        System.out.println("Devolucion de equipo de diseño registrada correctamente");
    }

    public void BuscarEquipoIngenieria() {
        System.out.println("Buscar equipo ingenieria");
    }

    public void BuscarEquipoDiseño() {
        System.out.println("Buscar equipo diseño");
    }

    public void ImprimirInventarioTotal() {
        System.out.println("Imprimir inventario total");
    }
}