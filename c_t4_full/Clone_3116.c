int main (void) {
    char input [100];
    int tokens [20], counter = 0;
    fgets (input, sizeof (input), stdin);
    input[strcspn (input, "\n")] = 0;
    char *pch = strtok (input, " ");
    while (pch != NULL) {
        int isNumber = 1;
        for (size_t i = 0; i < strlen (pch); ++i)
            if (!isdigit (pch[i]))
                isNumber = 0;
        if (isNumber)
            tokens[counter++] = atoi (pch);
        pch = strtok (NULL, " ");
    }
    qsort (tokens, counter, sizeof (int), compare);
    for (int i = 0; i < counter; ++i)
        printf ("%d ", tokens[i]);
    if (!counter)
        printf ("NONE FOUND");
    printf ("\n");
    return 0;
}





#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

int compare (const void* a, const void* b) {
            return (*(int*)a - *(int*)b);
        }

        int main (void) {
            char inputString[100];
            int tokens[20], total = 0;
            fgets (inputString, sizeof (inputString), stdin);
            inputString[strcspn (inputString, "\n")] = 0;
            char *word = strtok (inputString, " ");
            while (word != NULL) {
                int isInt = 1;
                for (size_t i = 0; i < strlen (word); ++i)
                    if (!isdigit (word[i]))
                        isInt = 0;
                if (isInt)
                    tokens[total++] = atoi (word);
                word = strtok (NULL, " ");
            }
            qsort (tokens, total, sizeof (int), compare);
            for (int i = 0; i < total; ++i)
                printf ("%d ", tokens[i]);
            if (!total)
                printf ("NONE FOUND");
            printf ("\n");
            return 0;
}


