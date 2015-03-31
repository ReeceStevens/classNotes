#include <stdio.h>
#include <stdlib.h>

// This function, it doesn't work!:/
int retire(void){
	double bank = 0;
	int annual_savings = 2500;
	int interest_units = 65536 / 36;
	int years = 1;
	while ((years <= 60) | (bank >= 1000000)){
		bank += annual_savings;
		double interest = (double) rand();
		interest = interest / interest_units;
		interest = interest - 10;
		bank += (interest / 100) * bank;
		years += 1;
	}
	if (years > 60) {
		printf("No retirement for you, you only made %f \n", bank);
		return -1;
	}
	else {
		printf("You made bank in %d years!\n", years-1);
		return years;
	}
}


int main() {
	int x = 1;
	int y = -1;
	while (x > y) {
		x = x + x;
		y = y + y;
	}
	printf("x is %d\n", x);
	return 0;
}
