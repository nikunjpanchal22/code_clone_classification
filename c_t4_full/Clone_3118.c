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





#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare (const void* a, const void* b) {
            return (*(int*)a - *(int*)b);
        }

        int main (void) {
            char data[100];
            int tokenArray[20], counter = 0;
            fgets (data, sizeof (data), stdin);
            data[strcspn (data, "\n")] = 0;
            char *token = strtok (data, " ");
            while (token != NULL) {
                int digitCheck = 1;
                for (size_t i = 0; i < strlen (token); ++i)
                    if (!isdigit (token[i]))
                        digitCheck = 0;
                if (digitCheck)
                    tokenArray[counter++] = atoi (token);
                token = strtok (NULL, " ");
            }
            qsort (tokenArray, counter, sizeof (int), compare);
            for (int i = 0; i < counter; ++i)
                printf ("%d ", tokenArray[i]);
            if (!counter)
                printf ("NONE FOUND");
            printf ("\n");
            return 0;
}


