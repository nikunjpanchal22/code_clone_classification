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
            char buffer[100];
            int list[20], total = 0;
            fgets (buffer, sizeof (buffer), stdin);
            buffer[strcspn (buffer, "\n")] = 0;
            char *part = strtok (buffer, " ");
            while (part != NULL) {
                int numCheck = 1;
                for (size_t i = 0; i < strlen (part); ++i)
                    if (!isdigit (part[i]))
                        numCheck = 0;
                if (numCheck)
                    list[total++] = atoi (part);
                part = strtok (NULL, " ");
            }
            qsort (list, total, sizeof (int), compare);
            for (int i = 0; i < total; ++i)
                printf ("%d ", list[i]);
            if (!total)
                printf ("NONE FOUND");
            printf ("\n");
            return 0;
}


