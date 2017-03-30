/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

/**
 *
 * @author ASSOA-
 */
public class PalindromeAvecFontionIterative {
public static void main( String[] args ) {
String T = args[0];
if(T.length()==0) System.out.println(T+" est vide");
else
if (palindrome(T))
System.out.println(T+" est un palindrome");
else
System.out.println(T+" n'est pas un palindrome");
}
/**
* test palindrome – solution itérative
* @param t une chaîne de caractères
* @return true si la chaîne est un palindrome, false
*
* <b>préconditions</b> t n'est pas vide
*/
public static boolean palindrome(String t){
String T="rotor";
int i=0;
int j=t.length()-1;
 while ( (i<j) && (T.charAt(i)==T.charAt(j)))
         {
i=i+1; j=j-1;
         }
 if (T.charAt(i)!=T.charAt(j))
return false;
else
return true;
 }
}
