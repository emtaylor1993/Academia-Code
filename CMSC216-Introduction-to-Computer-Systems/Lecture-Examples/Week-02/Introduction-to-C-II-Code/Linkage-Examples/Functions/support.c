#include <stdio.h>

void printSum(int limit) { /* What happens if you add static at the beginning */
   int sum = 0, k = 1;
   while (k <= limit) {
      sum += k;

      k++;
   }
   printf("The sum of %d is %d\n", limit, sum);
}
