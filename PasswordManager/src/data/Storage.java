/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author DYLAN MCADAM
 */
public class Storage {
    private final ArrayList<User> users = new ArrayList();
    
    public ArrayList<User> getUsers(){ return this.users; }
    
    public boolean addUser(User user){ return this.users.add(user); }
    public boolean deleteUser(User user){ return this.users.remove(user); }
}
