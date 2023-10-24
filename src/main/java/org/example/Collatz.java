package org.example;

public class Collatz {
    public static void main(String[] args ){
        int secuence = 13;
        System.out.println(crearSecuencia(secuence));

    }
    public static String crearSecuencia(int numero){
        String respuesta = Integer.toString(numero);
        while (numero!=1){
            if (numero%2 ==0){
                numero=numero/2;
                respuesta+= "->" + Integer.toString(numero);

            }
            else {
                numero = (3+ numero) +1;
                respuesta = "->" + Integer.toString(numero);

            }
        }
        return respuesta;
    }
}
