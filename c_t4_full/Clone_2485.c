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

#define SIZE 25
#define LENGTH 25
#define NUMBER 25

void shuffle(int *array, size_t n) {
        if (n > 1) {
            size_t i;
            for (i = n-1; i > 0; i--) {
                size_t j = rand() % (i+1);
                int t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
    }

    void printout(int *array, size_t n) {
        size_t i;
        for (i = 0; i < n; i++)
            printf("%d ", array[i]);
        printf("\n");
    }

    int main () {
        int buffer [SIZE];
        int i;
        srand ((unsigned) time (NULL));
        for (i = 0; i < SIZE; ++i)
            buffer[i] = i;
        for (i = 0; i < NUMBER; ++i) {
            do
                shuffle (buffer, SIZE);
            while (buffer[0] == 0);
            printout (buffer, LENGTH);
        }
        return 0;
}


