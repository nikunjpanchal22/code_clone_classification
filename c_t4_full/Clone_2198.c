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
    int ch;
    FILE *source, *dest;
    source = fopen ("source.txt", "r");
    dest = fopen ("destination.txt", "w");
    while ((ch = fgetc(source)) != EOF) {
        fputc(ch, dest);
    }
    fclose(source);
    fclose(dest);
    return 0;
}


