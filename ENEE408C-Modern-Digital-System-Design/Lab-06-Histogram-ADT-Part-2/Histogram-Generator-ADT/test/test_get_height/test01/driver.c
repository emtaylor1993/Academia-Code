#include <stdio.h>
#include "histgen.h"
#include "adtutil.h"

int main(void) {
	histgen_type *hist;
	int bins[] = {1, 2, 3, 4, 5, 6, 7, 8};
	int num_bins = 4;
	int w = 1;
	int h = 4;
	int stride = 8;
	int retVal;

	printf("\nTesting the \"histgen_get_height\" function...\n");

	hist = histgen_new(bins, num_bins, w, h, stride);

	retVal = DLC_VMETHOD_CALL(histgen, get_height, hist);

	printf("Method call complete...\n");

	if (retVal == 4) {
		printf("\nThe value returned was: %d\n", retVal);
		printf("Test 01: Get Height passed!\n");
	} else {
		printf("\nThe value returned was: %d\n", retVal);
		printf("Test 01: Get_Height failed.\n");
	}

	printf("\n");
	
	return 0;
}


