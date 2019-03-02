package org.erskineespaderos.exception;

public class ValidarException extends Exception{
    
    @Override
    public String getMessage(){
        return "Indice fuera de alcance del vector";
    }
}
