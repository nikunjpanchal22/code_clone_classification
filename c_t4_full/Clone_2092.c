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
    FILE *inputFile = NULL, *outputFile = NULL;
    int ch;

    inputFile = fopen("input.txt", "r");
    outputFile = fopen("output.txt", "w");

    if(inputFile == NULL) {
        printf("Cannot open input.txt for reading\n");
        return 1;
    }
    if(outputFile == NULL) {
        printf("Cannot open output.txt for writing\n");
        return 1;
    }
    
    while((ch = getc(inputFile)) != EOF)
        putc(ch, outputFile);
        
    fclose(inputFile);
    fclose(outputFile);
    return 0;
}


