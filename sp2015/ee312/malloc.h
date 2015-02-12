#include <stdio.h>
#include <stdint.h>

// THIS MACRO IS IMPORTANT
// Prevents a caller from declaring the same
// header file multiple times, causing issues
// with overriding declarations and large file 
// size.
#ifndef _MemHeap_h
#define _MemHeap_h

#define Malloc(x) allocateMemory(x)

void* allocateMemory(uint32_t size_in_bytes);
void deallocateMemory(void* p);


#endif
