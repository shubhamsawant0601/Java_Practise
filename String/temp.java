package String;

import java.util.*;
class temp
{
  public static void main(String args[])
  {  Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     char a [] = s.toCharArray();
     boolean openingdouble=false,closingdouble=false;
    
     for(int i=0;i<a.length-1;i++){
         if(a[i]=='(' && a[i+1]=='('){
             openingdouble = true;
             System.out.print(a[i]+" "+a[i+1]);
         }else if(a[i]==')' && a[i+1]==')'){
             closingdouble = true;
             System.out.print(a[i]+" "+a[i+1]);
         }
     }
   if(openingdouble && closingdouble){
       System.out.println("Yes");
   }else{
       System.out.println("No");
   }
    
  }
}