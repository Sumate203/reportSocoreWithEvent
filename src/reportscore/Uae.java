/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;

/**
 *
 * @author ASUS
 */
public class Uae implements ScoreListener {
      @Override
    public void scoreChange(ScoreEvent o){
        System.out.println(
       "live result :"+ ((ScoreEvent)o).getScore());     
    }
}
