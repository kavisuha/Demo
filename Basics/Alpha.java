public class Alpha
{
static void charcheck(char i)
{
    char i;
    if((i>=65 && i<=92)||(i>=97 && i<=122));
     {
      System.out.println("Alphabhet");
     }
     else if(i>=48 && i<=60)
     {
      System.out.println("Digit");
     }
     else
      {    
       System.out.println("Special character");
      }
     }
 public static void main(String args[])
{
   char i='#';
   charcheck(i);
}
}