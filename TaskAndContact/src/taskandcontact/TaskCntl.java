/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskandcontact;

/**
 *
 * @author Johnny
 */
public class TaskCntl {
     private TaskUI theTaskUI = null;
    private CalendarCntl theCalendarCntl;
    
    public TaskCntl(){
        theTaskUI = new TaskUI(this);
        theTaskUI.setLocationRelativeTo(null);
        theTaskUI.setVisible(true);
    }
    
    public void requestCalendar(){
        theTaskUI.setVisible(false);
        theCalendarCntl = new CalendarCntl();
    }
}
