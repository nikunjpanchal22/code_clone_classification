int main () {
    char line [200];
    size_t len = 0;
    FILE *f;
    f = fopen ("test.txt", "r");
    if (f == NULL) {
        printf ("Can't open file\n");
        return 1;
    }
    int line_no = 0;
    while (fgets (line, sizeof line, f)) {
        ++line_no;
        for (int i = 0; i < (sizeof words) / sizeof *words; i++) {
            if (strstr (line, words[i]) != NULL) {
                printf ("found %s in line %d\n", words [i], line_no);
            }
        }
    }
    fclose (f);
}



 


#include <stdio.h>

int main ()
{
    char line[200];
    FILE *f;
    f = fopen ("test.txt", "r");
    if (f == NULL)
    {
        printf ("Unable to open the file.\n");
        return 1;
    }

    int line_no = 0;
    while (fgets (line, sizeof line, f))
    {
        ++line_no;
        printf ("Line %d: %s", line_no, line);
    }
    fclose (f);
    return 0;
}


