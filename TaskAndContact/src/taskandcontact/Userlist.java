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
import java.util.*;
public class Userlist {
    private ArrayList<User> theListOfUsers;
    
    
    public Userlist(){
        // Do this if there are no real users
        if(theListOfUsers == null){
            buildTestUserList();
        }
    }
    
    public ArrayList<User> getListOfUsers(){
        if(theListOfUsers == null){
            buildTestUserList();
        }
        return theListOfUsers;
    }
    
    public void buildTestUserList(){
        theListOfUsers = new ArrayList();
        for(int i = 0; i < 100; i++){
            String username = ("test" + i);
            char[] password = {'t', 'e', 's', 't'};
            User newUser = new User(username, password);
            theListOfUsers.add(newUser);
        }
    }
    
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = false;
        boolean nameMatch = false;
        boolean passwordMatch = false;
        for(int i = 0; i < theListOfUsers.size(); i++){
            nameMatch = usernameToCheck.equals(theListOfUsers.get(i).getUsername());
            passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if(nameMatch && passwordMatch){
                authenticated = true;
                break;
            }
        }
        return authenticated;
    }
}
