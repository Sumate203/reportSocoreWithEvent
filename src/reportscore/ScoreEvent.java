/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;

import java.util.ArrayList;
import java.util.EventObject;

/**
 *
 * @author ASUS
 */
public class ScoreEvent extends EventObject {
     private String Score ="" ;

    public ScoreEvent(Object o,String val) {
        super(o);
        Score = val;
    }
   public String getScore(){
       return Score;
   }
     
}
