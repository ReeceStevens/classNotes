#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>

struct String {
	char* ptr;
	uint32_t length;
}

/* Initialize and return a string
 * use the input (mundane C string) as a reference
 * for the contents of the created string
 */
String StringCreate(const char input[]){ // const is a promise to treat the data as read-only
	// First step: declare the struct
	String result;
	uint32_t k = 0;
	while(input[k]){
		k += 1;
	}
	result.length = k;
	result.ptr = (char*) malloc(k);
	for (k = 0; k < result.length; k += 1) {
		result.ptr[k] = input[k];
	}
	return result;	
}

String StringDup(String in){
	String result;
	result.length = in.length;
	result.ptr = (char*) malloc(result.length);
	for (uint32_t k = 0; k < result.length; k += 1) {
		result.ptr[k] = in.ptr[k];
	}
	return result;
}

void StringPrint(String s) {
	for (uint32_t k = 0; k < s.length; k+=1){
		putchar(s.ptr[k]);
	}
}

uint32_t StringSize(String s) {
	return s.length;
}

void StringDestroy(String s) {free(s.ptr);}

int main(void) {
	String s = StringCreate("Craig");
	String t = s; // YOU STILL ONLY HAVE ONE STRING. Remember that t is a shallow reference, only a pointer to the same string.
	// printf() won't work since our string doesn't have a null terminator
	printf("Hello ");
	StringPrint(s);
   	printf(" I see you're %d characters long\n", s.length); // using s.ptr and s.length is BAD, don't do this for the project!
	StringDestroy(s);
}
