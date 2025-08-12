int main () {
    FILE *fin;
    FILE *fout;
    int character;
    fin = fopen ("in.txt", "r");
    fout = fopen ("out.txt", "w");
    while ((character = fgetc (fin)) != EOF) {
        for (int i = 0; i < numberOfBytesInChar ((unsigned char) character) - 1; i++) {
            putchar (character);
            fprintf (fout, "%c", character);
            character = fgetc (fin);
        }
        putchar (character);
        printf (" ");
        fprintf (fout, "%c ", character);
    }
    fclose (fin);
    fclose (fout);
    printf ("\nFile has been created...\n");
    return 0;
}



pp
int main ()
{
    FILE *before, *after;
    int c;
    before = fopen ("read.txt", "r");
    after = fopen ("write.txt", "w");
    while ((c = fgetc(before)) != EOF) {
        putchar(c);
        fprintf(after, "%c", c);
    }
    fclose(before);
    fclose(after);
    return 0;
}


