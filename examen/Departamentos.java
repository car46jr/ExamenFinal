package registrardepartamentosguatemala;

import java.util.Scanner;

public class Departamentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosArray registroDep = new MetodosArray();//Los registros de los vectores.
        MetodosListas registroListasDep = new MetodosListas();

        int opcion = 0;

        do {

            System.out.println("""
                                 " Menu principal\n"
                                 "Seleccione la opcion de registro que desee utilizar"
                                           + "1. Metodo Arrays "
                                           + "2. Metodo Listas"
                                           + "0. Salir:)""");

            System.out.println("Ingrese la opcion que desea usar: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    int select = 0;

                    do {
                        
                        System.out.println("""
                                 " Menu principal\n"
                                 "Seleccione la opcion de registro que desee utilizar"
                                           + "1. Agregar al registro"
                                           + "2. nombre-posicion"
                                           + "3. inial-nombre"
                                           + "4. Posicion-pares"
                                           + "5. Departamentos Registrados(historial)"
                                           + "0. Regresar inicio" :)""");

                        System.out.println("Ingrese la opcion que desea usar: ");
                        select = sc.nextInt();

                        switch (select) {

                            case 5:
                               
                                registroDep.mostrasDatoss();

                                break;

                            case 2:
                            
                                registroDep.mostrarDatos2();
                                break;

                            case 3:
                                registroDep.busquedaDep();
                                break;
                            case 4:
                                registroDep.paryim();
                                break;

                            case 1:
                                String nombreA = "";
                                String cabeceraA = "";
                                int numeroB = 0;
                                int numeroOrden = 0;

                                registroDep.datosDepartamento(numeroOrden, nombreA, numeroB, cabeceraA);

                                break;

                            case 0:

                                break;
                        }

                    } while (select != 0);

                    break;

/**Inicio de metodo listas**/
                case 2:

                    int select2 = 0;

                    do {
                        System.out.println("""
                                 " Menu principal"
                                 "Seleccione la opcion de registro que desee utilizar"
                                           + "1. Agregar al registro"
                                           + "2. Verificacion de departamento"
                                           + "3. Limpiar lista\n"
                                           + "4. Mostrar registro (historial)"
                                           + "0. Regresar inicio" :)""");
                        
                        System.out.println("Ingrese la opcion que desea usar: ");
                        select2 = sc.nextInt();

                        switch (select2) {

                            case 1:
                           
                                registroListasDep.lista();

                                break;

                            case 2:
                              
                                registroListasDep.verificarDepartamento();
                                break;

                            case 3:
                               
                                registroListasDep.eliminarListas();
                                System.out.println("Lista Vacia Verifica");
                                break;

                            case 4:
                              
                                String nombreA = "";
                                String departamentoA = "";
                                int cantidadMunicipios = 0;
                                int numeroOrden = 0;

                                registroListasDep.listaDepartamento(numeroOrden, nombreA, departamentoA, cantidadMunicipios);

                                break;

                            case 0:

                                break;
                        }

                    } while (select2 != 0);

                    break;

            }

        } while (opcion != 0);

        System.out.println("Fin del Programa UwU");
    }
}
