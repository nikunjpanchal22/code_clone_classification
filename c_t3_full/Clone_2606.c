int main (void) {
    FILE *fin, *fout;
    int c;
    if ((fin = fopen ("input.txt", "r")) == NULL) {
        fprintf (stderr, "Cannot read from input.txt");
        return 1;
    }
    if ((fout = fopen ("output.txt", "w")) == NULL) {
        fprintf (stderr, "Cannot write to output.txt");
        fclose (fin);
        return 1;
    }
    while ((c = fgetc (fin)) >= 0) {
        fputc (c, fout);
    }
    fclose (fin);
    fclose (fout);
    return 0;
}




#include<stdio.h>

int main () {
    FILE *source, *destination;
    int charachter;

    source = fopen ("input.txt", "r");
    if (!source) {
        puts("Error reading from input.txt");
        return 1;
    }

    destination = fopen ("output.txt", "w");
    if (!destination) {
        puts("Error writing to output.txt");
        fclose (source);
        return 1;
    }

    while ((charachter = fgetc (source)) != EOF)
        fputc (charachter, destination);
    
    fclose (source);
    fclose (destination);
    return 0;
}


