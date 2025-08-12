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

#define FILE_NAME "test.txt"
#define MAX_COLUMNS 256

void bubbleSortWordsArray(char** wordsArray, int count);
void printWordsArray(char** wordsArray, int count);

int main (void) {
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("fopen failed");
        exit(EXIT_FAILURE);
    }

    char* words[MAX_COLUMNS];    // pointers to words
    char word[MAX_COLUMNS];      // buffer to hold each word
    int i = 0;
    while (fgets(word, sizeof word, fp) != NULL) {
        words[i] = strdup(word);
        words[i][strlen(words[i]) - 1] = '\0';
        i++;
    }

    fclose(fp);
    
    bubbleSortWordsArray(words, i);
    printWordsArray(words, i);

    return 0;
}


