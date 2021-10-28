#include <stdio.h>
#include <stdlib.h>

#define MAX_LEN 80

int main() {
   FILE *input_stream, *output_stream;
   char filename[MAX_LEN + 1];   
   char line[MAX_LEN + 1];   

   /* input file */
   printf("Provide input file name: ");
   scanf("%s", filename);
   if ((input_stream = fopen(filename, "r")) == NULL) {
      perror("error opening file");
      exit(EXIT_FAILURE);
   }

   /* output file */
   printf("Provide output file name: ");
   scanf("%s", filename);
   if ((output_stream = fopen(filename, "w")) == NULL) {
      perror("error opening file");
      exit(EXIT_FAILURE);
   }

   /* copying data */
   while (fgets(line, MAX_LEN + 1, input_stream) != NULL) {
      fputs(line, output_stream);
   }

   fclose(input_stream);
   fclose(output_stream);

   return EXIT_SUCCESS;
}
