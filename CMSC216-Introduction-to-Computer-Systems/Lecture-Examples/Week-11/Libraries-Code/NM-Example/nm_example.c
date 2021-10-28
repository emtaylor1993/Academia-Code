#include <stdio.h>

#define F_VAL 2

int my_global = 10;


int func_a(int val){
	return (val * F_VAL)%100;
}

int func_b(int val){
	return 1;
}

int func_c(int val){
	return 1;
}

int main() {
   printf("Done\n");

   return 0;
}
