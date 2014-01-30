public class Hasard3
{
   public static void main(String args[])
   {
      final int MIN = 0;
      final int MAX = 1000000;
      int nbLances = 0;
      final int LARGEURECRAN = 60;

      if (args.length == 1)
      {
         try
         {
            int Choix = Integer.parseInt(args[0]);
            if (Choix >= MIN && Choix <= MAX)
            {
               nbLances = Choix;

               int Tab[] = new int[11];


               for (int i = 0; i < nbLances; i++)
               {
                  int De1 = (int)((Math.random() * 6) + 1);
                  int De2 = (int)((Math.random() * 6) + 1);
                  int LancerDes = De1 + De2;
                  Tab[LancerDes - 2]++;
               }

               System.out.println("Valeur | Nombre d'occurences");
               System.out.println("-------|--------------------");
               int plusGrand = Tab[0];
               for (int k = 1; k <Tab.length; k++)
               {
                  if (Tab[k] > plusGrand)
                     plusGrand = Tab[k];
               }
               for (int j = 0; j < Tab.length; j++)
               {
                  int nbdiese = 0;
                  if (nbLances != 0)
                  {
                      nbdiese = Tab[j] * LARGEURECRAN / plusGrand;
                  }
                  
                  if (j < 8)
                  {
                     System.out.print("     " + (j + 2) + " | ");
                     for (int f = 0; f < nbdiese; f++)
                     {
                        System.out.print("#");
                     }
                     System.out.println(" " + Tab[j]);
                  }
                  else
                  {
                     System.out.print("    " + (j + 2) + " | ");
                     for (int f = 0; f < nbdiese; f++)
                     {
                        System.out.print("#");
                     }
                     System.out.println(" " + Tab[j]);
                  }
               }

            }
            else
            {
               System.out.println("Parametre hors borne");
            }
         }
         catch (NumberFormatException e)
         {
            System.out.println("Parametre invalide");
         }
      }
      else
      {
         System.out.print("Trop de parametre");
      }
   }
}
