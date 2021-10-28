#include <stdio.h>

int bGlobal; /* What happens if we add extern at the beginning? */
             /* What happens if we assign a value? */

void process();

int main() {

   printf("Before calling process %d\n", bGlobal);
   process();
   printf("After calling process %d\n", bGlobal);

   return 0;    
}
