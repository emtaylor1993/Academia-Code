#include <stdio.h>

#define MAX_LENGTH 80

void parse(char data[], int *array) {
   sscanf(data, "%d,%d,%d", array, array + 1, array + 2);
}

int main() {
   char data[MAX_LENGTH + 1];   
   int int_array[3], idx;

   printf("Input three comma separated values (e.g., 10,20,30): ");
   scanf("%s", data);
   parse(data, int_array);

   for (idx = 0; idx < 3; idx++) {
      printf("%d\n", int_array[idx]);
   }
   
   return 0;
}
