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
public class NotificationCntl {
    private NotificationUI theNotificationUI = null;
    private CalendarCntl theCalendarCntl;
    
    public NotificationCntl(){
        theNotificationUI = new NotificationUI(this);
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    
    public void requestCalendar(){
        theNotificationUI.setVisible(false);
        theCalendarCntl = new CalendarCntl();
    }
}
