#include <stdio.h>
#include <stdlib.h>
#include <sysexits.h>

/* 
 *
   1. Try a.out students_data.txt
   2. Try ( a.out students_data.txt > results.txt ) >& error_warnings.txt
 *
 */

#define MAX_LEN 80

int main(int argc, char *argv[]) {
   FILE *input; 
   char buffer[MAX_LEN + 1];
   char name[MAX_LEN + 1];
   int age, processed;
   
   printf("Starting data processing...\n");

   /* Deciding where input will come from */
   if (argc == 1) {
      input = stdin;   /* standard input */
   } else if (argc == 2) { 
      /* Using file provided by the user */
      input = fopen(argv[1], "r");
      if (input == NULL) {
          fprintf(stderr, "File %s cannot be opened!\n", argv[1]);
          return EX_OSERR;   /* Notice error that is returned */
      }
   } else {
      fprintf(stderr, "Usage: a.out\n");
      fprintf(stderr, "Usage: a.out <filename>\n");
      return EX_USAGE;      /* Notice error that is returned */
   }

   fprintf(stderr, "Warning: About to open file\n");

   fgets(buffer, MAX_LEN + 1, input); /* reads a line */
   while (!feof(input)) {
      processed = sscanf(buffer, "%s %d", name, &age); /* extracting from the line what we need */
      if (processed == 2)
	  printf("%s %d\n", name, age);
      else 
	  printf("%s AGE_NOT_SPECIFIED\n", name);

      fgets(buffer, MAX_LEN + 1, input); /* reads next line */
   }

   fclose(input);
   printf("See you later\n");

   return EXIT_SUCCESS;
}
