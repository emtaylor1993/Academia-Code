/*
 * To test indent utility 
 */
#include <stdio.h>




void  process();




int      main()      {
   int   y;
 
       /* reading and increasing by 10 */
   printf("Enter value: ");
   scanf("%d",&y);
   y    =     y    + 10;              /* can be written as y += 10 */
   printf("%d",y);
   if   (     y    >=    0) { 
   printf("y is positive");
}
else
{
   printf("y is negative");
}
   process( y   );
   
   

   return 0;
}

/* first support function */
void     process    (int    x){
   int    a    = x;
   int b  =   x;

   while (x-- > 0) {    printf("Processing\n"); }



   do 
   {



      printf("Processing do while\n");
   } while (a-- > 0);

   switch  (b  )   {
      case 1:
     printf("one\n");
            break;
  
      case 2:
           printf("two\n"); break;

              default:
                   printf("other\n");       break;
  }  
}
