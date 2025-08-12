int main () {
    char buffer [SIZE];
    int i;
    srand ((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i;
    for (i = 0; i < NUMBER; ++i) {
        do
            shuffle (buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 100
#define NUMBER 10
#define LENGTH 10

void shuffle(char *array, size_t n)
{
    if (n > 1) 
    {
        size_t i;
	for (i = 0; i < n - 1; i++) 
        {
            size_t j = i + rand() / (RAND_MAX / (n - i) + 1);
            char t = array[j];
            array[j] = array[i];
            array[i] = t;
        }
    }
    }

void printout(char *buffer, size_t length) 
{
    for(size_t i=0; i<length; i++) {
        printf("%c ", buffer[i]);
    }
    printf("\n");
    }

int main () 
{
    char buffer [SIZE];
    int i;
    srand((unsigned) time (NULL));
    for (i = 0; i < SIZE; ++i)
        buffer[i] = (char) i;
    for (i = 0; i < NUMBER; ++i) 
    {
        do
            shuffle(buffer, SIZE);
        while (buffer[0] == 0);
        printout (buffer, LENGTH);
    }
    return 0;
}


