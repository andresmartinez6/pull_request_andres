package pullrequest;

import java.util.Scanner;

public class PullRequest {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Hola soy jose");
        
       
        double num1,num2,suma;
        
        System.out.println("Hola soy Andrés");
        System.out.println("Te hago la siguiente mejora en tu codigo:");
        System.out.println("-----------------------------------------"
                + "\nIntroduce 2 numeros y haré la suma");
        num1=teclado.nextDouble();
        num2=teclado.nextDouble();
        
        suma=num1+num2;
        
        if(suma>5){
            System.out.println("Eres un crak");
        }else{
            System.out.println("Eres un matao");
        }
        
        
    }
    
}
