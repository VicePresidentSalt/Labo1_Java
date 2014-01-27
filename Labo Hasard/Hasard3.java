public class Hasard3
{
   public static void main(String args[])
   {    
      int Tab[] = new int[11];
      
      final int ESSAIE = 1000;
         int Somme = 0;
         for(int i = 0 ; i < ESSAIE ; i++)
         {
         
         int De1 = ( int )( (Math.random() * 6)+ 1 );
         int De2 = ( int ) ( (Math.random() * 6)+ 1 );
         int LancerDes = De1 + De2;
         Tab[LancerDes-2]++;
         }
         
      System.out.println( "Valeur | Nombre d'occurences" );
      System.out.println( "-------|--------------------" ); 
       for( int j = 0 ; j < Tab.length ; j++)
       {
         int nbdiese = Tab[j]/10;
         if( j < 8)
         {
         System.out.print( "     " + (j+2) + " | ");
         for(int f = 0 ; f < nbdiese ; f++)
        {
            System.out.print("#");
        }
         System.out.println(" " + Tab[j]);
         }
         else
         {
         System.out.print( "    " + (j+2) + " | " );
        for(int f = 0 ; f < nbdiese ; f++)
        {
            System.out.print("#");
        }
        System.out.println(" " +Tab[j]);
        }
      }
   }
}