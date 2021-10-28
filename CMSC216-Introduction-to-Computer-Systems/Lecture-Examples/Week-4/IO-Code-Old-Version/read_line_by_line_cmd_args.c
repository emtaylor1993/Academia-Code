#include <stdio.h>
#include <stdlib.h>

#define MAX_LEN 80

int main(int argc, char *argv[]) {
   FILE *input;
   char buffer[MAX_LEN + 1];

   if (argc != 2) {
      printf("Usage: %s <filename>\n", argv[0]);
      exit(EXIT_FAILURE);
   } else {
      if ((input = fopen(argv[1], "r")) == NULL) {  /* argv[1] --> filename */
         perror("error opening file");
         exit(EXIT_FAILURE);
      } else {
         while (fgets(buffer, MAX_LEN + 1, input) != NULL) {
            printf("%s", buffer);
         } 
      }
   }
   fclose(input);

   return EXIT_SUCCESS;
}
