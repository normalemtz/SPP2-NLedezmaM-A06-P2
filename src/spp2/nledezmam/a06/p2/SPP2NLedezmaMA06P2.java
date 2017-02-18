/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a06.p2;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n = solicitaDatos("un número entre 0 y 10: ");
        int f = 1;
        if (n<=10){ 
            System.out.print(n+"! = ");
            for (n=n; n>0; n--){
                System.out.print("(" + n + ")");
                f = f * n;
            } System.out.println(" = " + f);
        } else 
            System.out.println("Introdujo un número fuera del rango");
    }
public static int solicitaDatos(String mensaje){
        Scanner tecl = new Scanner (System.in);
        int ventero = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        ventero = tecl.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            tecl.nextLine();
            
        return ventero;
    }     
    } while (flag); 
    return ventero;
    }    
    }
    

