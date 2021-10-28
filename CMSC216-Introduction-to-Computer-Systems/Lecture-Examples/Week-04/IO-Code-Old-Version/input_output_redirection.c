#include <stdio.h>

/* Runs:
 * a.out
 * a.out < input_output_redirection.txt
 * a.out < input_output_redirection.txt > results.txt
 */
int main() {
   int limit, idx;

   printf("Enter limit: ");
   scanf("%d", &limit);
   for (idx = 0; idx <= limit; idx++) {
      printf("%d ", idx);
   }
   printf("\n");

   return 0;
}
