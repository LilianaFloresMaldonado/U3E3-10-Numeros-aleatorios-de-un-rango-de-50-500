package pilas;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
      boolean continuar=true;
      int opcion;
      int palabra;
      Trabajo3_pilas pila=new Trabajo3_pilas();
      Scanner leer=new Scanner (System.in);
     
      while(continuar){
         System.out.println("****Opciones******");
         System.out.println("1.-Insertar");
         System.out.println("2.-Eliminar");
         System.out.println("3.-Mostrar");
         System.out.println("4.-Salir");
         System.out.println("ingresar una opción");
         opcion=leer.nextInt();
                  
                switch(opcion){
                    case 1:
                        pila.Númerosaleatorios();
                        break;
                    case 2:
                        if (!pila.estaVacia()){
                        pila.EliminarPila();
                        System.out.println("Se ha borrado un el elemento");
                         }else{
                            System.out.println("La pila esta vacia");
                        }
                        
                        break;
                    case 3:
                        pila.mostrarPila();
                        break;
                    case 4:
                        continuar=false;
                        break;
                    default:
                        break;
                   }     
                }
           
        }
    }

            
        
    
