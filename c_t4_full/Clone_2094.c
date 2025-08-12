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
    FILE *fin, *fout;
    char c;
    if(!(fin = fopen("input.txt", "r"))) {
        perror("Unable to read from input.txt");
        return EXIT_FAILURE;
    }
    if(!(fout = fopen("output.txt", "w"))) {
        perror("Unable to write to output.txt");
        fclose(fin);
        return EXIT_FAILURE;
    }
    while((c = getc(fin)) != EOF)
      putc(c, fout);
    fclose(fin);
    fclose(fout);
    return EXIT_SUCCESS;
}


