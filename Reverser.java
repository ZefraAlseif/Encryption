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
public class Reverser extends Transpose implements Constants
{
public Reverser(String s)
{
   super(s);
}
public String reverseText(String word)
{
   
 StringBuffer result = new StringBuffer(word);
 result.reverse();
 return result.toString();
    
}
public String decode(String word)
{
 StringBuffer result = new StringBuffer(word);
 result.reverse();
 return result.toString();
    
}
}
