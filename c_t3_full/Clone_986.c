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


  int main () {
    FILE *fin;
    FILE *fout;
    int character;
    fin = fopen ("in.txt", "r");
    fout = fopen ("out.txt", "w");
    while ((character = fgetc (fin)) != EOF) {
        char bit_pattern[8];
        int byte_count = 0;
        get_bit_pattern_from_char(bit_pattern, (unsigned char) character, &byte_count);
        for (int i = 0; i < byte_count - 1; i++) {
            putchar (bit_pattern[i]);
            fprintf (fout, "%c", bit_pattern[i]);
            character = fgetc (fin);
        }
        putchar (bit_pattern[byte_count - 1]);
        printf (" ");
        fprintf (fout, "%c ", bit_pattern[byte_count - 1]);
    }
    fclose (fin);
    fclose (fout);
    printf ("\nFile has been created...\n");
    return 0;
}


