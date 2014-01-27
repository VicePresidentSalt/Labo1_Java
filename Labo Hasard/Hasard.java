public class Hasard
{
   public static void main(String args[])
   {
      // génération d'un entier > 0 et < 6
      int De1 = ( int )( (Math.random() * 6)+1 );
      int De2 = ( int ) ( (Math.random() * 6)+1 );
      System.out.println( "De 1 = " + De1 );
      System.out.println( "De 1 = " + De2 );   
   }
}