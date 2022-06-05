package registrardepartamentosguatemala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosListas {

     List<MetodosListas> listaDepar = new ArrayList<>();//DECLARACION DEL OBJETO DE LA LISTA.
     Scanner sc= new Scanner(System.in);

    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA, verLista;
    int verLista2;

    String nombreRs;
    int numerol, cantidadMuni;
    String descripcionA, departamentos;
    
    public MetodosListas() {
        
    }

    public MetodosListas(int numerol,String nombreRs,String departamentos, int cantidadMuni) {
       
        this.numerol = numerol;
        this.nombreRs = nombreRs;
        this.departamentos = departamentos;
        this.cantidadMuni = cantidadMuni;
       
    }

    public String getNombreRs() {
        return nombreRs;
    }

    public void setNombreC(String nombreRs) {
        this.nombreRs = nombreRs;
    }
    
    public String getDepartamentos() {
        return departamentos;
    }

    public void setdepartamentos(String Departamentos) {
        this.departamentos = departamentos;
    }

    public int getcantidadMuni() {
        return cantidadMuni;
    }

    public void cantidadMuni(int cantidadMunicipios) {
        this.cantidadMuni = cantidadMunicipios;
    }

   public int getnumerol() {
        return numerol;
    }

    public void setnumerol(int numerol) {
        this.numerol = numerol;
    }
    
    
    
    
    public void listaDepartamento(int numeroOrden,String nombreA, String departamentoA, int cantidadMunicipios){
                        
        System.out.println("ingrese numero posicion");
        numeroOrden = sc.nextInt();

        System.out.println("ingrese el nombre del departamento");
        nombreA = sc.next();

        System.out.println("ingrese la cabecera del de´partamento");
        departamentoA = sc.next();

        System.out.println("ingrese los municipios que tiene el departamento");
        cantidadMunicipios = sc.nextInt();
           
        listaDepar.add(new MetodosListas(numeroOrden,nombreA,departamentoA, cantidadMunicipios));
    }
    
    public void lista(){

        //AQUI SE MUESTRA TODA LA LISTA DE LAS TABLAS DE LAS LISTAS.
        System.out.println("*Historial Lista*");
        System.out.println("\n");
        
        for (int i=0; i<listaDepar.size(); i++) {
            
            System.out.println("| posicion: " + listaDepar.get(i).getnumerol());
            System.out.println("| departamento: " + listaDepar.get(i).getNombreRs());
            System.out.println("| cabecera : " + listaDepar.get(i).getDepartamentos());
            System.out.println("| cantidad de municipios: " + listaDepar.get(i).getcantidadMuni());
            System.out.println("|---------------------------------------------");
        }
    }
     public void eliminarListas(){
         listaDepar.clear();
     }
     
     public void verificarDepartamento (){
		
         Scanner teclado = new Scanner(System.in);
         String valor = "";
         int indice;

         System.out.println("Verificar registro de un departamento.");
         valor = teclado.next();
         indice = listaDepar.indexOf(valor);
         if (indice != 0) {
             System.out.println("Este registro si esta registrado");
         } else {
             System.out.println("Este registro del departamento no se encuentra");

         }  
     
 }
}