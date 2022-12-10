/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

/**
 *
 * @author carlo
 */
public interface Constants 
{
    static final int WRAP_AROUND = 26;
    static final int ENCODE_SHIFT = 3;
    static final int DECODE_SHIFT = 23;
    
   public abstract String encode(String s);
   public abstract String decode(String s);
}
