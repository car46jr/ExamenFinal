
package registrardepartamentosguatemala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public final class MetodosArray {
    
    //Variables de los primeros vectores.
     float numeroBA;
     String nombreB = "";
     String nombreA = "";
     int codigoA, numeroB;
     int codigoC, CodigoG;
     String cabeceraA;
     int numeroOrden;
     
     //VARIABLES DE LOS VECTORES.
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     
      Scanner sc= new Scanner(System.in);
     
    //constructor
     public MetodosArray(){
        this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        this.codigoC=0;
        this.CodigoG=0;
        this.numeroOrden=0;
        this.cabeceraA="";
         vectorDatos = new String [100];
         this.indiceVector= 0;  
         
         //SE INICIALIZA EL VECTOR.
      

     }
     
    public void datosDepartamento (int numeroOrden,String nombreA, int numeroB, String cabeceraA){
                        
                         System.out.println("***Ingrese numero posicion: ***");
                          numeroOrden=sc.nextInt();
                          
                        System.out.println("***Ingrese el nombre del departamento: ***");
                          nombreA=sc.next();
                          
                        System.out.println("***Ingrese la cantidad de municipios: ***");
                         numeroB= sc.nextInt();
                            
                        System.out.println("***Ingrese la cabecera del departamento: ***");
                         cabeceraA = sc.next();
                         
              //REGRISTRAR LOS DATOS DE LOS DATOS INGRESADOS EN LOS VECTORES EN ORDEN.           
             this.registrarD1("-","","Numero de posicion: ","",numeroOrden);            
            this.registrarD2("-","","Nombre del Departamento: ","",nombreA);
            this.registrarD3("-","","Cantidad Municipios: ","",numeroB);
            this.registrarD4("-","","Cabecera: ","",cabeceraA);

     }
    
        
       public void registrarD1(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
     public void registrarD2(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }   
    public void registrarD3(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   public void registrarD4(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }

   public void mostrasDatoss(){
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }
   
       
       static void posicionDatos(int[]almacenarDatos){
           
  
   }
            
}
      