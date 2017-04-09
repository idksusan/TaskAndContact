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
public class CalendarCntl {
         private CalendarUI theCalendarUI = null;
         private NavigationCntl theNavigationCntl;
         private ViewCalendarCntl theViewCalendarCntl;
         private TaskCntl theTaskCntl;
         private NotificationCntl theNotificationCntl;

    
    public CalendarCntl(){
        theCalendarUI = new CalendarUI(this);
        theCalendarUI.setLocationRelativeTo(null);
        theCalendarUI.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theCalendarUI.setVisible(false);
        theNavigationCntl = new NavigationCntl();
    }
    
    public void requestViewCalendarCntl(){
        theCalendarUI.setVisible(false);
        theViewCalendarCntl = new ViewCalendarCntl();
    }
    
    public void requestTaskCntl(){
        theCalendarUI.setVisible(false);
        theTaskCntl = new TaskCntl();
    }
    
    public void requestNotificationCntl(){
        theCalendarUI.setVisible(false);
        theNotificationCntl = new NotificationCntl();
    }
   
    
}
