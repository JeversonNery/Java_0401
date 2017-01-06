/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0401;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.printf("Nome completo: ");
        String nm = scan.nextLine();
        
        System.out.printf("Sexo (M ou F): ");
        String sx = scan.nextLine();
        char ch = sx.charAt(0);
        
        System.out.printf("Renda familiar: ");
        double rf = scan.nextDouble();
        
        System.out.println("\nDADOS GRAVADOS:");
        System.out.println("Nome:\t" + nm);
        System.out.println("Sexo:\t" + ch);
        System.out.println("Renda:\t" + nf.format(rf));
   }
    
}
