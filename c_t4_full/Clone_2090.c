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
    char ch;
    FILE *readfile, *writefile;

    readfile = fopen("input.txt", "r");
    writefile = fopen("output.txt", "w");

    if (readfile == NULL) {
        printf("Unable to open input.txt.\n");
        fclose(readfile);
        return 1;
    }
    else if (writefile == NULL) {
        printf("Unable to open output.txt.\n");
        fclose(writefile);
        return 1;
    }
    else {
        ch = fgetc(readfile);
        while (ch != EOF) {
            fputc(ch, writefile);
            ch = fgetc(readfile);
        }
    }
    fclose(readfile);
    fclose(writefile);
    return 0;
}


