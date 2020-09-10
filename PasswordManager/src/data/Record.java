/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Calendar;

/**
 *
 * @author DYLAN MCADAM
 */
public class Record {
    
    private String title = "";
    private String username = "";
    private String password = "";
    private final Calendar date = Calendar.getInstance();;
    private int usernameX = 0;
    private int usernameY = 0;
    private int passwordX = 0;
    private int passwordY = 0;
    private boolean coordiantesLocked = false;
    
    public Record(String title, String username, String password, int ux, int uy, int px, int py, boolean locked){
        this.title = title;
        this.username = username;
        this.password = password;
        this.usernameX = ux;
        this.usernameY = uy;
        this.passwordX = px;
        this.passwordY = py;
        this.coordiantesLocked = locked;
    }
    
    public void setTitle(String title){ this.title = title; }
    public String getTitle(){ return this.title; }
    
    public void setUsername(String username){ this.username = username; }
    public String getUsername(){ return this.username; }
    
    public void setPassword(String password){ this.password = password; }
    public String getPassword(){ return this.password; }
    
    public void setUX(int ux){ this.usernameX = ux; }
    public int getUX(){ return this.usernameX; }
    
    public void setUY(int uy){ this.usernameY = uy; }
    public int getUY(){ return this.usernameY; }
    
    public void setPX(int px){ this.passwordX = px; }
    public int getPX(){ return this.passwordX; }
    
    public void setPY(int py){ this.passwordY = py; }
    public int getPY(){ return this.passwordY; }
    
    public void setLockedState(boolean l){ this.coordiantesLocked = l; }
    public boolean getLockedState(){ return this.coordiantesLocked; }
    
}
