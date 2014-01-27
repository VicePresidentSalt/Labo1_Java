public class Hasard2
{
   public static void main(String args[])
   {    
      int Tab[] = new int[11];
      System.out.println( "Valeur | Nombre d'occurences");
      System.out.println( "-------|--------------------"); 
      final int ESSAIE = 1000;
         int Somme = 0;
         for(int i = 0 ; i < ESSAIE ; i++)
         {
         
         int De1 = ( int )( (Math.random() * 6)+ 1 );
         int De2 = ( int ) ( (Math.random() * 6)+ 1 );
         int LancerDes = De1 + De2;
         Tab[LancerDes-2]++;
         }
       for( int j = 0 ; j < Tab.length ; j++)
       {
         if( j < 8)
         System.out.println( "     " + (j+2) + " | " + Tab[j] );
         else
         System.out.println( "    " + (j+2) + " | " + Tab[j] );
      }
   }
}