/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DYLAN MCADAM
 */
public class PasswordUtilities {
    
    public static byte[] generateSalt(){
        SecureRandom r = new SecureRandom();
        byte[] salt = new byte[256];
        r.nextBytes(salt);
        return salt;
    }
    
    public static String generateSecurePassword(String inputPassword, byte[] salt){
        StringBuilder sb = new StringBuilder();
        try{
            
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            byte[] inputPasswordAsBytes = md.digest(inputPassword.getBytes(StandardCharsets.UTF_8));
            
            for (int i = 0; i < inputPasswordAsBytes.length; i++) 
                sb.append(Integer.toString((inputPasswordAsBytes[i] & 0xff) + 0x100, 16).substring(1));
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PasswordUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }
    
}
