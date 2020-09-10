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
public class User {
    
    private final String username;
    private final String saltedPassword;
    private final ArrayList<Record> recordObjects = new ArrayList();
    
    public User(String username, String saltedPassword){
        this.username = username;
        this.saltedPassword = saltedPassword;
    }
    
    public String getUsername(){ return this.username; }
    
    public String getSaltedPassword(){ return this.saltedPassword; }
    
    public ArrayList<Record> getRecordObjects(){ return this.recordObjects; }
    public boolean addRecordObject(Record record){ return this.recordObjects.add(record); }
    public boolean deleteRecordObject(Record record){ return this.recordObjects.remove(record); }
    
}
