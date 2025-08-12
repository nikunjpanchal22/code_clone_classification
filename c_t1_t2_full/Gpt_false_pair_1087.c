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


 int main()
{
    FILE *fin;
    FILE *fout;
    int character;
    fin = fopen("in.txt", "rb");
    fout = fopen("out.txt", "ab");
    while ((character = fgetc(fin)) != EOF)
    {
        for (int i = 0; i < numberOfBytesInChar((unsigned char)character) - 1; i++)
        {
            putchar(character);
            fwrite(&character, sizeof(character), 1, fout);
            character = fgetc(fin);
        }
        putchar(character);
        printf(" ");
        fwrite(&character, sizeof(character), 1, fout);
    }
    fclose(fin);
    fclose(fout);
    printf("\nFile has been created...\n");
    return 0;
}
