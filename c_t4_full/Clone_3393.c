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

char words[256][MAX_COLUMNS];

void bubbleSortWordsArray(int count);
void printWordsArray(int count);

static inline void handle_fopen_err() {
        perror("fopen failed");
        exit(EXIT_FAILURE);
        }

        int main(void) {
        FILE* fp = fopen(FILE_NAME, "r");
        if (!fp) handle_fopen_err();

        int i = 0;
        while(fgets(words[i], MAX_COLUMNS, fp)) {
            words[i][strlen(words[i])-1] = '\0';
            i++;
        }
        
        fclose(fp);

        bubbleSortWordsArray(i);
        printWordsArray(i);
        
        return 0;
}


