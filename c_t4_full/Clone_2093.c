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
#include<stdlib.h>

int main () {
    char ch;
    FILE *read_file = fopen("input.txt", "r");
    if(read_file == NULL) {
        perror("Cannot open input.txt");
        return EXIT_FAILURE;
    }
    FILE *write_file = fopen("output.txt", "w");
    if(write_file == NULL) {
        perror("Cannot open output.txt");
        return EXIT_FAILURE;
    }
    while((ch = fgetc(read_file)) != EOF)
      fputc(ch, write_file);
    fclose(read_file);
    fclose(write_file);
    return EXIT_SUCCESS;
}


