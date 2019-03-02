package org.erskineespaderos.sistema;

import java.util.Date;
import org.erskineespaderos.bean.Book;
import org.erskineespaderos.exception.ValidarException;
import org.erskineespaderos.util.ManejadorDeArchivos;
import org.erskineespaderos.interfaces.OnClickListener;

public class Principal {
    public static void main(String args[]){ //Metodo main
        
        OnClickListener onclickListener = new OnClickListener() {
            @Override
            public void onClick(String mensaje) {
                System.out.println("Un : " + mensaje);
            }
        };
        
        onclickListener.onClick("Click en Panel de Control");
        OnClickListener onClickListenerLamba = (String mensaje) -> {
            System.out.println("Un : " + mensaje);
        };
        onClickListenerLamba.onClick("Click derecho en el escritorio de Windows");
        
        /*
        int n = 100;            
        int m = 100/2;
        assert n == m : "La variables no son iguales";
        //assert false : "La variables son iguales";
        
        try {
            String authors[] = {"Juan Perez","Julio Matinez"};
            Book lista[] = new Book[5];
            //lista[0] = new Book("Book1",new Date(),"Editorial 1",authors);
            //lista[1] = new Book("Book2",new Date(),"Editorial 2",authors);
            //lista[2] = new Book("Book3",new Date(),"Editorial 3",authors);
            //lista[3] = new Book("Book4",new Date(),"Editorial 4",authors);
            //lista[4] = new Book("Book5",new Date(),"Editorial 5",authors);
            //lista[0].setIsbn("1111");
            //lista[1].setIsbn("2222");
            //lista[2].setIsbn("3333");
            //lista[3].setIsbn("4444");
            //lista[4].setIsbn("5555");
            //imprimirLibos(lista);
            //guardarInformacion(lista);
            //mostrarInformacion("books.txt");
        //} catch(Exception e){
        //} catch(ValidarException e){
        } catch(Exception e){
            //e.printStackTrace();
            System.out.println("Error: " + e.getMessage()); //Muestra el error o la excepcion
        } finally{
            System.out.println("Esto siempre se ejecuta si o no, existe una excepcion"); //finally
        }*/
        

    }
    
    public static void imprimirLibos(Book[] libros) throws ValidarException{ //throws esquiva
        try{                                                                        //Intentar
            for(int i = 0; i < libros.length; i++){//Indice empieza desde 0 e incrementa
                System.out.println(libros[i]);
            }
        } catch(Exception e){                  //atrapa la excepcion
            throw new ValidarException(); //throws lanza la excepcion
        } 
    }
    
    public static void guardarInformacion(Book[] libros){
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("books.txt");
        for(int i = 0; i < libros.length; i++){
            manejador.escribir(libros[i].toString());
        }
    }
    
    public static void mostrarInformacion(String archivo){
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("books.txt");
        System.out.println(manejador.leer(archivo));
    }
    
}
