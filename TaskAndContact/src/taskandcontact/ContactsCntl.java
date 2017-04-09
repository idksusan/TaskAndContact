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
public class ContactsCntl {
    private ContactsUI theContactsUI = null;
    private NavigationCntl theNavigationCntl;
    
    public ContactsCntl(){
        theContactsUI = new ContactsUI(this);
        theContactsUI.setLocationRelativeTo(null);
        theContactsUI.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theContactsUI.setVisible(false);
        theNavigationCntl = new NavigationCntl();
    }
}
