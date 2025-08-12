int main (void) {
    FILE *fp = NULL;
    if (NULL == (fp = fopen (FILE_NAME, "r"))) {
        perror ("fopen failed");
        exit (EXIT_FAILURE);
    }
    int i = 0;
    while (fgets (words[i], MAX_COLUMNS, fp)) {
        words[i][strlen (words[i]) - 1] = '\0';
        i++;
    }
    bubbleSortWordsArray (i);
    printWordsArray (i);
    return (0);
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define FILE_NAME "data.txt"
#define MAX_COLUMNS 100

char words[100][MAX_COLUMNS];

void bubbleSortWordsArray(int size);
void printWordsArray(int size);

int main (void) {
    FILE *fp = fopen (FILE_NAME, "r");
    if (fp == NULL) {
        perror ("fopen failed:");
        exit (EXIT_FAILURE);
    }
    int i = 0;
    while (fgets (words[i], MAX_COLUMNS, fp)) {
        words[i][strlen (words[i]) - 1] = '\0';
        i++;
    }
    bubbleSortWordsArray (i);
    printWordsArray (i);
    fclose(fp);
    return 0;
}


