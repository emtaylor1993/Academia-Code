#include <stdio.h>
#include "first.h"
#include "second.h"

int main() {
   int val1, val2;

   printf("Give 2 integers:");
   scanf("%d%d", &val1, &val2);
   printf("first(%d) = %d\n", val1, f(val1));
   printf("first(%d) = %d\n", val2, f(val2));
   printf("second(%d) = %d\n", val1, s(val1));
   printf("second(%d) = %d\n", val2, s(val2));
   return 0;
}
