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




#define FILE_NAME "test.txt"
#define MAX_COLUMNS 256

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char words[MAX_COLUMNS];

void bubbleSortWordsArray(int);
void printWordsArray(int);

int main() {
    FILE *fp = fopen(FILE_NAME, "r");
    if(fp == NULL) {
        perror("fopen failed");
        exit(EXIT_FAILURE);
    }
    int i = 0;
    while(fgets(words[i], sizeof(words[i]), fp) != NULL) {
        words[i][strlen (words[i]) - 1] = '\0';
        i++;
    }
    bubbleSortWordsArray (i);
    printWordsArray (i);
    fclose(fp);
    return 0;
}


