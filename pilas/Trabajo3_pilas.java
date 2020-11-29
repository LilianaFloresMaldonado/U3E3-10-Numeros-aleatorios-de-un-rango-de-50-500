package pilas;


public class Trabajo3_pilas {
    Nodo cima;
    int tamanio;
    
    public boolean estaVacia(){
        return cima==null;
    }
    
    public void Empujar(int elemento){
        Nodo nodo=new Nodo(elemento);
        nodo.siguiente=cima;
        cima=nodo;
        tamanio++;
    }
    public int EliminarPila(){
        
        int auxiliar=cima.elemento;
        cima=cima.siguiente;
        tamanio--;
        return auxiliar;
        
         
    }
    public void mostrarPila(){
        Nodo recorre=cima;
        while(recorre!=null){
            System.out.println(recorre.elemento);
            recorre=recorre.siguiente;
        }
        System.out.println("");
    
    }
    
    public void Númerosaleatorios(){
            for(int i=0; i<10;i++){
            int n=(int) (Math.random()*500)+50;
            Empujar(n);
       
       }
    }
}
    
     
