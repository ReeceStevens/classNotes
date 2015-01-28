#include <stdio.h>
//#include "UART.h" //for uVision terminal simulator

#define TRUE 1
#define FALSE 0

// Global Variables
short glob = 0;

// Function Prototypes
unsigned char isPrime(short);

// Problem Statement: Print all primes less than a given N

int main(){
	int16_t N, num; //signed short
	printf("Enter Number N: ");
	scanf("%hd", &N);
	printf("\nPrimes less than %hd are:\n", N);
	num = 1;
	while(num <= N) {
		if(isPrime(num)) {
			printf("%d", num);
		} 
		num++;	
	}
	
	return 0;
}

unsigned char isPrime(int16_t number) {

	int16_t factor = 2;
	unsigned char result = TRUE;

	while ((factor <= number/2) && (result == TRUE)) {
		if (number % factor == 0) {
			result = FALSE;
		}
		factor = factor + 1;
	}
	return result;
}
