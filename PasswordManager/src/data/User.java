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
    private final byte[] salt;
    private final String securePassword;
    private final ArrayList<Record> recordObjects = new ArrayList();
    
    public User(String username, String securePassword, byte[] salt){
        this.username = username;
        this.securePassword = securePassword;
        this.salt = salt;
    }
    
    public String getUsername(){ return this.username; }
    
    public String getSecurePassword(){ return this.securePassword; }
    
    public byte[] getSalt(){ return this.salt; }
    
    public ArrayList<Record> getRecordObjects(){ return this.recordObjects; }
    public boolean addRecordObject(Record record){ return this.recordObjects.add(record); }
    public boolean deleteRecordObject(Record record){ return this.recordObjects.remove(record); }
    
}
