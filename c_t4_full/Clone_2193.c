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
    int charData;
    FILE *src, *dest;
    src = fopen ("src.txt", "r");
    dest = fopen ("dest.txt", "w");
    while ((charData = fgetc(src)) != EOF) {
        fprintf(dest, "%c", charData);
        printf("%c", charData);
    }
    fclose(src);
    fclose(dest);
    return 0;
}


