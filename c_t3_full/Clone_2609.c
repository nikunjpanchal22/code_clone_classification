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
    FILE *read, *write;
    int c;

    read = fopen("input.txt", "r");
    if(read == NULL) {
        fprintf(stderr, "Cannot open input.txt");
        return 1;
    }

    write = fopen("output.txt", "w");
    if(write == NULL) {
        fprintf(stderr, "Cannot open output.txt");
        fclose(read);
        return 1;
    }

    while((c = fgetc(read)) != EOF)
        fputc(c, write);

    fclose(read);
    fclose(write);
    return 0;
}


