/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscore;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ScoreSource {
        private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String val) {
		
            fireSubscriberEvent(new ScoreEvent(this,val));
	}
	
	public void addSubscriberListener(ScoreListener l) {
		listeners.add(l);
	}
	public void removeSubscriberListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireSubscriberEvent(ScoreEvent e) {
      for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
