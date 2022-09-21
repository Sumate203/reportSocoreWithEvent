/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    Thai obj1 = new Thai();
    Uae obj2 = new Uae();
    ScoreSource  source= new ScoreSource(); 
    source.addSubscriberListener(obj1);
    source.addSubscriberListener(obj2);
    int a = 0;
        Scanner inp = new Scanner(System.in);
        while(a == 0){
        System.out.print("Enter Score");
        String result = inp.nextLine();
         if(result.equals("")){
             a = 1;
         } 
        if(!result.equals("")){
         source.setScoreLine(result);
         }
       }
    }
}
