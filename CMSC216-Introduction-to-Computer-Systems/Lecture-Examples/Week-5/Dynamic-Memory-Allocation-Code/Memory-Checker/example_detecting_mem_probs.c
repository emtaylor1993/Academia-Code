#include <stdio.h>
#include <stdlib.h>
#include <mcheck.h>
#include <malloc.h>

#include "my_memory_checker_216.h"

int get_choice();
void memory_leak_example();
void double_free();
void out_of_bounds_write();

int get_choice() {
   int choice;

   printf("1. Memory leak\n");
   printf("2. Double free\n");
   printf("3. Writing out of area\n");
   printf("4. Dangling pointer\n");
   printf("Enter number of problem you want to see: ");
   scanf("%d", &choice);

   return choice;
}

void memory_leak_example() {
   int *p = malloc(sizeof(int));

   *p = 20;
   printf("Value is %d\n", *p);
}

void double_free_example() {
   int *p = malloc(sizeof(int));

   *p = 20;
   printf("Value is %d\n", *p);
   free(p);
   free(p);
}

void out_of_bounds_write_example() {
   int *p = malloc(sizeof(int));

   *(p + 1) = 20;
   printf("Value is %d\n", *p);
   free(p);
}

/* We don't get error message */
void dangling_pointer_example() {
   int *p = malloc(sizeof(int));

   *p = 777;
   printf("Value is %d\n", *p);

   /* deallocating */
   free(p); 

   /* p is a dangling pointer */
   *p = 888;
   printf("Value is %d\n", *p);

}

int main() {

   /***** Starting memory checking *****/
   start_memory_check(); 
   /***** Starting memory checking *****/

   switch(get_choice()) {
      case 1:
         memory_leak_example();
         break;
      case 2:
         double_free_example();
         break;
      case 3:
         out_of_bounds_write_example();
         break; 
      case 4:
         dangling_pointer_example();
         break; 
      default:
         fprintf(stderr, "Invalid choice\n");
	 break;
   }

   /****** Gathering memory checking info *****/
   stop_memory_check(); 
   /****** Gathering memory checking info *****/

   return 0;
}
