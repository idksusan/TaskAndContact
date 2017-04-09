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
public class ViewCalendarCntl {
     private ViewCalendarTable theViewCalendarTable = null;
         private CalendarCntl theCalendarCntl;

    
    public ViewCalendarCntl(){
        theViewCalendarTable = new ViewCalendarTable(this);
        theViewCalendarTable.setLocationRelativeTo(null);
        theViewCalendarTable.setVisible(true);
    }
    
    public void requestCalendarCntl(){
        theViewCalendarTable.setVisible(false);
        theCalendarCntl = new CalendarCntl();
    }
    
    
}
