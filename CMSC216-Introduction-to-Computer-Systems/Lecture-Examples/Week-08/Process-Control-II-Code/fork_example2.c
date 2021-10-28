#include <sysexits.h>
#include <stdlib.h>
#include <err.h>
#include <unistd.h>
#include <sys/types.h>
#include <stdio.h>

int main() {
   int age = 17;
   pid_t child_pid;

   printf("PPID main process: %d\n", getppid());
   printf("Output: ");  /* Notice this message is might be printed twice */
                        /* as buffer is duplicated as part of the fork below */
                        /* fflush(stdout) will flush the buffer */
   if ((child_pid = fork()) < 0) {
       err(EX_OSERR, "fork error");
   }

   if (child_pid) {  /* parent code */
      printf("I'm your father pid=%d, child pid=%d\n", getpid(), child_pid);
      age--;
      printf("Var in parent = %d\n", age);
   } else {          /* child code */
      printf("Nooooo! Child pid=%d; my parent pid=%d\n", getpid(), getppid());
      age++;
      printf("Var in child = %d\n", age);
   }

   return 0;
}
