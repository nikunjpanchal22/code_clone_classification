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

#define MAX_COLUMNS 100
#define FILE_NAME "filename.txt"

char words[MAX_COLUMNS][MAX_COLUMNS];

void bubbleSortWordsArray(int n);
void printWordsArray(int n);

int main()
{
    FILE* fp;
    if ((fp = fopen(FILE_NAME, "r")) == NULL) {
        perror("fopen failed");
        exit(EXIT_FAILURE);
    }
    int i = 0;
    while (fgets(words[i], MAX_COLUMNS, fp)) {
        words[i][strlen(words[i]) - 1] = '\0';
        i++;
    }
    fclose(fp);
    bubbleSortWordsArray(i);
    printWordsArray(i);
    return 0;
}


