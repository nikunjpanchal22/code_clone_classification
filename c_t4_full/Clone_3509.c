int main () {
    char c;
    FILE *fp;
    fp = fopen ("test.txt", "w+");
    for (int i = 0; i < 10; i++) {
        fprintf (fp, "Test line %i\n", i);
    }
    rewind (fp);
    do {
        do {
            fscanf (fp, "%c", & c);
            if (c == ' ')
                break;
            printf ("%c", c);
        }
        while (c != ' ');
        do {
            fscanf (fp, "%c", & c);
            printf ("%c", c);
        }
        while (c != '\n');
    }
    while ((c = fgetc (fp)) != EOF ? printf ("%c", c) : 0);
    fclose (fp);
}



#include <stdio.h>
int main () {
    FILE *fp = fopen ("test.txt", "w+");
    for (int i = 0; i < 10; i++) fprintf (fp, "Test line %d\n", i);
    rewind (fp);
    char c;
    while ((c = fgetc(fp)) != EOF) {
        if(c != '\n') printf ("%c", c);
    }
    fclose (fp);
}


