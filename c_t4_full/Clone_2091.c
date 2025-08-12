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
    FILE *inFile, *outFile;
    int character;
    inFile = fopen ("input.txt", "r");
    if (inFile == NULL) {
        printf("Unable to read from input.txt");
        return -1;
    }
    outFile = fopen ("output.txt", "w");
    if (outFile == NULL) {
        printf("Unable to write to output.txt");
        fclose(inFile);
        return -1;
    }
    while((character = fgetc(inFile)) != EOF)
        fputc(character, outFile);
    fclose(inFile);
    fclose(outFile);
    return 0;
}


