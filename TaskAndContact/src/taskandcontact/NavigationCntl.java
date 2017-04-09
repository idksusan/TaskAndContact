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
public class NavigationCntl {
     private NavigationUI theNavigationUI = null;
     private LoginCntl theLoginCntl;
     private CalendarCntl theCalendarCntl;
     private ContactsCntl theContactsCntl;

    
    public NavigationCntl(){
        theNavigationUI = new NavigationUI(this);
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
    }
    
    public void requestCalendarCntl(){
        theNavigationUI.setVisible(false);
        theCalendarCntl = new CalendarCntl();
    }
    
    public void requestContactCntl(){
        theNavigationUI.setVisible(false);
        theContactsCntl = new ContactsCntl();
    }
    
    public void requestLoginCntl(){
        theNavigationUI.setVisible(false);
        theLoginCntl = new LoginCntl();
    }
    
    public void getNavigationCntl(){
        if(theNavigationUI == null){
            theNavigationUI = new NavigationUI(this);
            theNavigationUI.setLocationRelativeTo(null);
            theNavigationUI.setVisible(true);
        }else{
            theNavigationUI.setVisible(true);
        }
    }
    
    
}
