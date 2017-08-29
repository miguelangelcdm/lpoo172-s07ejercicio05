/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner( System.in);
        System.out.println("agua en kg:");
        double kg=input.nextDouble();
        System.out.println("temperatura inicial: ");
        double ti=input.nextDouble();
        System.out.println("temperatura final: ");
        double tf=input.nextDouble();
        double e=kg*(tf-ti)*4184;
        System.out.println("la energia requerida es: "+e);
    }
    
}
