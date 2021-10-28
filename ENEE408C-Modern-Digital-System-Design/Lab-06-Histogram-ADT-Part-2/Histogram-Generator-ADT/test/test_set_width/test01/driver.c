#include <stdio.h>
#include "histgen.h"
#include "array_list.h"
#include "list.h"
#include "adtutil.h"

int main(void) {
	histgen_type *hist;
	int bins[] = {1, 2, 3, 4};
	int num_bins = 2;
	int w = 2;
	int h = 1;
	int stride = 4;
	int retVal = 0;

	printf("\nTesting the \"histgen_set_width\" function...\n");

	hist = histgen_new(bins, num_bins, w, h, stride);	

	printf("Value of width before calling: %d.\n", retVal);	
	DLC_VMETHOD_CALL_X(histgen, set_width, hist, w);
	retVal = DLC_VMETHOD_CALL(histgen, get_width, hist);
	printf("Method call complete...\n");
	printf("Value of width after calling: %d.\n", retVal);

	if (retVal == 2) {
		printf("Test 01: Set Width passed!\n");
	} else {
		printf("Test 01: Set Width failed.\n");
	}

	printf("\n");

	return 0;
}
