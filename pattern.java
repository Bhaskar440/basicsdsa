import java.util.*;
public static void main (String[] args)
{
    /* When the pattern is 
    *****
    *****
    *****
    *****
    *****
    */ 
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    /*When the pattern is 
    *
    **
    ***
    ****
    *****
    */
   for(int i=0;i<5;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }  
    /*When the pattern is 
    1
    12
    123
    1234
    12345
    */
   for(int i=1;i<6;i++)
   {
    for(int j=1;j<i;j++)
    {
        System.out.print(j);
    }
    System.out.println("");
   }
   /*When the pattern is 
    1
    22
    333
    4444
    55555
    */
   for(int i=1;i<6;i++)
   {
    for(int j=0;j<i;j++)
    {
        System.out.print(i);
    }
    System.out.println("");
   }
   /*When the pattern is 
    *****
    ****
    ***
    **
    *
    */
   for(int i=0;i<5;i++)
   {
    for(int j=5;j>i;j--)
    {
        System.out.print("*");
    }
    System.out.println("");
   }
   /*When the pattern is 
    12345
    1234
    123
    12
    1
    */
   for(int i=0;i<5;i++)
   {
    for(int j=1;j<5-i;j++)
    {
        System.out.print(j);
    }
    System.out.println("");
   }
}