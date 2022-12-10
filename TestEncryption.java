/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class TestEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message");
        output += "The original message is \n" + text + "\n";
        Cipher c = new Caeser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCeasar Cipher\nThe encrypted message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decrypted message is \n" + code + "\n";
        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output +="The decripted Transpose message is \n" + code + "\n";
        c = new Reverser(text);
        c.encrypt();
        code = c.encode(code); //Replace code = c.reverseText(code) & code = c.getEncodedMessage() with code = c.encode(code);
        output += "\nReverser\nThe encrypted Reverse message is \n" + code+ "\n";
        code = c.decode(code);
        output+="The decrypted Reverse message is \n" + code;
        display(output);
}
static void display(String s)
{
JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt",
JOptionPane.INFORMATION_MESSAGE);
}
    }
    

