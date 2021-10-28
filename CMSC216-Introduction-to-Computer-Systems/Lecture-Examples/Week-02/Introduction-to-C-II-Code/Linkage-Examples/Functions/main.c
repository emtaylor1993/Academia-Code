#include <stdio.h>

/* What happens if you add static at the beginning of the prototype? */

void printSum(int limit); /* What happens if you comment this out? */

int main() {

   printSum(4);

   return 0;
}
