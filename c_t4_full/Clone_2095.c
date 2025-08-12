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




#include <stdio.h>

int main() {
    char c;
    FILE *inputFile, *outputFile;
    inputFile = fopen("input.txt", "r");
    outputFile = fopen("output.txt", "w");
    if (inputFile == NULL || outputFile == NULL) {
        printf("Error in file operation");
        return 1;
    }
    c = fgetc(inputFile);
    while (c != EOF) {
        fputc(c, outputFile);
        c = fgetc(inputFile);
    }
    fclose(inputFile);
    fclose(outputFile);
    return 0;
}


