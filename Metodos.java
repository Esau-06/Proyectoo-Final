import java.util.Scanner;
import java.util.LinkedList;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    LinkedList vector_ingenieros = new LinkedList();
    LinkedList vector_diseñadores = new LinkedList();
    LinkedList vector_portatil = new LinkedList();
    LinkedList vector_tableta = new LinkedList();

    public void RegistrarPrestamoIngenieria() {

        EstudianteIngenieria e = new EstudianteIngenieria();
        ComputadorPortatil c = new ComputadorPortatil();

        System.out.println("REGISTRAR PRESTAMO INGENIERIA");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        if (ExisteCedulaIngenieria(e.getCedula())) {
            System.out.println("El estudiante ya tiene un equipo registrado");
            return;
        }

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

        if (ExisteSerialIngenieria(c.getSerial())) {
            System.out.println("El serial del computador ya esta registrado");
            return;
        }

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

        vector_ingenieros.add(e);
        vector_portatil.add(c);

        System.out.println("Prestamo de ingenieria registrado correctamente");
    }

    public void RegistrarPrestamoDiseño() {

        EstudianteDiseño e = new EstudianteDiseño();
        TabletaGrafica t = new TabletaGrafica();

        System.out.println("REGISTRAR PRESTAMO DISEÑO");

        System.out.println("Ingrese cedula del estudiante");
        e.setCedula(sc.next());

        if (ExisteCedulaDiseño(e.getCedula())) {
            System.out.println("El estudiante ya tiene un equipo registrado");
            return;
        }

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

        if (ExisteSerialDiseño(e.getSerialEquipo())) {
            System.out.println("El serial de la tableta ya esta registrado");
            return;
        }

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

        vector_diseñadores.add(e);
        vector_tableta.add(t);

        System.out.println("Prestamo de diseño registrado correctamente");
    }

    public void ModificarPrestamoIngenieria() {

        System.out.println("MODIFICAR PRESTAMO INGENIERIA");

        System.out.println("Ingrese cedula del estudiante");
        String cedula = sc.next();

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria e = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (e.getCedula().equals(cedula)) {

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

                System.out.println("Registro modificado correctamente");
                System.out.println("La cedula y el serial no se modifican");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void ModificarPrestamoDiseño() {

        System.out.println("MODIFICAR PRESTAMO DISEÑO");

        System.out.println("Ingrese cedula del estudiante");
        String cedula = sc.next();

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño e = (EstudianteDiseño) vector_diseñadores.get(i);

            if (e.getCedula().equals(cedula)) {

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

                System.out.println("Registro modificado correctamente");
                System.out.println("La cedula y el serial no se modifican");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void DevolverEquipoIngenieria() {

        System.out.println("DEVOLUCION EQUIPO INGENIERIA");

        System.out.println("Ingrese cedula del estudiante");
        String cedula = sc.next();

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria e = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (e.getCedula().equals(cedula)) {

                String serial = e.getSerialEquipo();

                vector_ingenieros.remove(i);

                for (int j = 0; j < vector_portatil.size(); j++) {

                    ComputadorPortatil c = (ComputadorPortatil) vector_portatil.get(j);

                    if (c.getSerial().equals(serial)) {
                        vector_portatil.remove(j);
                        j = vector_portatil.size();
                    }
                }

                System.out.println("Devolucion de equipo de ingenieria registrada correctamente");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void DevolverEquipoDiseño() {

        System.out.println("DEVOLUCION EQUIPO DISEÑO");

        System.out.println("Ingrese cedula del estudiante");
        String cedula = sc.next();

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño e = (EstudianteDiseño) vector_diseñadores.get(i);

            if (e.getCedula().equals(cedula)) {

                int serial = e.getSerialEquipo();

                vector_diseñadores.remove(i);

                for (int j = 0; j < vector_tableta.size(); j++) {

                    TabletaGrafica t = (TabletaGrafica) vector_tableta.get(j);

                    if (t.getSerial().equals(serial + "")) {
                        vector_tableta.remove(j);
                        j = vector_tableta.size();
                    }
                }

                System.out.println("Devolucion de equipo de diseño registrada correctamente");
                return;
            }
        }

        System.out.println("No se encontro el estudiante");
    }

    public void BuscarEquipoIngenieria() {

        int opcion = 0;

        System.out.println("BUSCAR EQUIPO INGENIERIA");
        System.out.println("1. Buscar por cedula");
        System.out.println("2. Buscar por serial");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese cedula");
                BuscarEquipoIngenieria(sc.next());
                break;

            case 2:
                System.out.println("Ingrese serial");
                BuscarEquipoIngenieria(sc.next(), 1);
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public void BuscarEquipoIngenieria(String cedula) {

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria e = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (e.getCedula().equals(cedula)) {

                System.out.println("ESTUDIANTE ENCONTRADO");
                System.out.println("Cedula: " + e.getCedula());
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Apellido: " + e.getApellido());
                System.out.println("Telefono: " + e.getTelefono());
                System.out.println("Semestre: " + e.getNumeroSemestre());
                System.out.println("Promedio: " + e.getPromedioAcumulado());
                System.out.println("Serial equipo: " + e.getSerialEquipo());
                return;
            }
        }

        System.out.println("No se encontro estudiante con esa cedula");
    }

    public void BuscarEquipoIngenieria(String serial, int opcion) {

        for (int i = 0; i < vector_portatil.size(); i++) {

            ComputadorPortatil c = (ComputadorPortatil) vector_portatil.get(i);

            if (c.getSerial().equals(serial)) {

                System.out.println("COMPUTADOR ENCONTRADO");
                System.out.println("Serial: " + c.getSerial());
                System.out.println("Marca: " + c.getMarca());
                System.out.println("Tamaño: " + c.getTamano());
                System.out.println("Precio: " + c.getPrecio());
                System.out.println("Sistema operativo: " + c.getSistemaOperativo());
                System.out.println("Procesador: " + c.getProcesador());
                return;
            }
        }

        System.out.println("No se encontro computador con ese serial");
    }

    public void BuscarEquipoDiseño() {

        int opcion = 0;

        System.out.println("BUSCAR EQUIPO DISEÑO");
        System.out.println("1. Buscar por cedula");
        System.out.println("2. Buscar por serial");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese cedula");
                BuscarEquipoDiseño(sc.next());
                break;

            case 2:
                System.out.println("Ingrese serial");
                BuscarEquipoDiseño(sc.nextInt());
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public void BuscarEquipoDiseño(String cedula) {

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño e = (EstudianteDiseño) vector_diseñadores.get(i);

            if (e.getCedula().equals(cedula)) {

                System.out.println("ESTUDIANTE ENCONTRADO");
                System.out.println("Cedula: " + e.getCedula());
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Apellido: " + e.getApellido());
                System.out.println("Telefono: " + e.getTelefono());
                System.out.println("Modalidad: " + e.getModalidadEstudio());
                System.out.println("Cantidad asignaturas: " + e.getCantidadAsignaturas());
                System.out.println("Serial equipo: " + e.getSerialEquipo());
                return;
            }
        }

        System.out.println("No se encontro estudiante con esa cedula");
    }

    public void BuscarEquipoDiseño(int serial) {

        for (int i = 0; i < vector_tableta.size(); i++) {

            TabletaGrafica t = (TabletaGrafica) vector_tableta.get(i);

            if (t.getSerial().equals(serial + "")) {

                System.out.println("TABLETA ENCONTRADA");
                System.out.println("Serial: " + t.getSerial());
                System.out.println("Marca: " + t.getMarca());
                System.out.println("Tamaño: " + t.getTamano());
                System.out.println("Precio: " + t.getPrecio());
                System.out.println("Almacenamiento: " + t.getAlmacenamiento());
                System.out.println("Peso: " + t.getPeso());
                return;
            }
        }

        System.out.println("No se encontro tableta con ese serial");
    }

    public void ImprimirInventarioTotal() {

        System.out.println("INVENTARIO TOTAL");

        System.out.println("ESTUDIANTES DE INGENIERIA");
        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria e = (EstudianteIngenieria) vector_ingenieros.get(i);

            System.out.println("Cedula: " + e.getCedula());
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Apellido: " + e.getApellido());
            System.out.println("Telefono: " + e.getTelefono());
            System.out.println("Semestre: " + e.getNumeroSemestre());
            System.out.println("Promedio: " + e.getPromedioAcumulado());
            System.out.println("Serial equipo: " + e.getSerialEquipo());
            System.out.println("----------------------------");
        }

        System.out.println("COMPUTADORES PORTATILES");
        for (int i = 0; i < vector_portatil.size(); i++) {

            ComputadorPortatil c = (ComputadorPortatil) vector_portatil.get(i);

            System.out.println("Serial: " + c.getSerial());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Tamaño: " + c.getTamano());
            System.out.println("Precio: " + c.getPrecio());
            System.out.println("Sistema operativo: " + c.getSistemaOperativo());
            System.out.println("Procesador: " + c.getProcesador());
            System.out.println("----------------------------");
        }

        System.out.println("ESTUDIANTES DE DISEÑO");
        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño e = (EstudianteDiseño) vector_diseñadores.get(i);

            System.out.println("Cedula: " + e.getCedula());
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Apellido: " + e.getApellido());
            System.out.println("Telefono: " + e.getTelefono());
            System.out.println("Modalidad: " + e.getModalidadEstudio());
            System.out.println("Cantidad asignaturas: " + e.getCantidadAsignaturas());
            System.out.println("Serial equipo: " + e.getSerialEquipo());
            System.out.println("----------------------------");
        }

        System.out.println("TABLETAS GRAFICAS");
        for (int i = 0; i < vector_tableta.size(); i++) {

            TabletaGrafica t = (TabletaGrafica) vector_tableta.get(i);

            System.out.println("Serial: " + t.getSerial());
            System.out.println("Marca: " + t.getMarca());
            System.out.println("Tamaño: " + t.getTamano());
            System.out.println("Precio: " + t.getPrecio());
            System.out.println("Almacenamiento: " + t.getAlmacenamiento());
            System.out.println("Peso: " + t.getPeso());
            System.out.println("----------------------------");
        }
    }

    public boolean ExisteCedulaIngenieria(String cedula) {

        for (int i = 0; i < vector_ingenieros.size(); i++) {

            EstudianteIngenieria e = (EstudianteIngenieria) vector_ingenieros.get(i);

            if (e.getCedula().equals(cedula)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteSerialIngenieria(String serial) {

        for (int i = 0; i < vector_portatil.size(); i++) {

            ComputadorPortatil c = (ComputadorPortatil) vector_portatil.get(i);

            if (c.getSerial().equals(serial)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteCedulaDiseño(String cedula) {

        for (int i = 0; i < vector_diseñadores.size(); i++) {

            EstudianteDiseño e = (EstudianteDiseño) vector_diseñadores.get(i);

            if (e.getCedula().equals(cedula)) {
                return true;
            }
        }

        return false;
    }

    public boolean ExisteSerialDiseño(int serial) {

        for (int i = 0; i < vector_tableta.size(); i++) {

            TabletaGrafica t = (TabletaGrafica) vector_tableta.get(i);

            if (t.getSerial().equals(serial + "")) {
                return true;
            }
        }

        return false;
    }
}