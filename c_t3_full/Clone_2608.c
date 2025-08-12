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

int main() {
    FILE *fromFile, *toFile;
    int character;

    fromFile = fopen("input.txt", "r");
    if(fromFile == NULL) {
        printf("Unable to read from input.txt\n");
        return 1;
    }

    toFile = fopen("output.txt", "w");
    if(toFile == NULL) {
        printf("Unable to write to output.txt\n");
        fclose(fromFile);
        return 1;
    }

    while((character = fgetc(fromFile)) != EOF) 
        fputc(character, toFile);

    fclose(fromFile);
    fclose(toFile);
    return 0;
}


