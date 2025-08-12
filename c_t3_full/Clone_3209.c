int main (void) {
    FILE *fp = NULL;
    char file_name [257] = {'\0'};
    char line [61] = {'\0'};
    char word [61] = {'\0'};
    int out = 0;
    printf ("Enter file name:\n");
    scanf (" %256[^\n]", file_name);
    if ((fp = fopen (file_name, "r")) == NULL) {
        printf ("could not open file\n");
        return 1;
    }
    while ((fscanf (fp, "%60s", word)) == 1) {
        if (strlen (line) + strlen (word) + 1 <= 60) {
            strcat (line, " ");
            strcat (line, word);
            out = 0;
        }
        else {
            printf ("%s\n", line);
            strcpy (line, word);
            out = 1;
        }
    }
    if (!out) {
        printf ("%s\n", line);
    }
    fclose (fp);
    return 0;
}



#include <stdio.h>
#include <string.h>

int main (void) {
    FILE *fp = NULL;
    char file_name [257];
    char line [61] = "";
    char word [61] = "";

    printf ("Enter file name:\n");
    fgets(file_name, 257, stdin);
    file_name[strcspn(file_name, "\n")] = 0;

    if ((fp = fopen (file_name, "r")) == NULL) {
        printf ("could not open file\n");
        return 1;
    }
    while ((fscanf (fp, "%60s", word)) == 1) {
        if (strlen (line) + strlen (word) + 1 <= 60) {
            strcat (line, " ");
            strcat (line, word);
        }
        else {
            printf ("%s\n", line);
            strcpy (line, word);
        }
    }
    printf ("%s\n", line);
    fclose (fp);
    return 0;
}


