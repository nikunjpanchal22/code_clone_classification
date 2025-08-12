int main (void) {
    FILE *file_ptr;
    int character;
    int prev_char_was_letter = 0;
    int word_count = 0;
    file_ptr = fopen ("my_file.txt", "r");
    if (!file_ptr) {
        fprintf (stderr, "can't open file\n");
        return 1;
    }
    character = fgetc (file_ptr);
    while (character != EOF) {
        if (is_alpha (character) && !prev_char_was_letter) {
            word_count++;
            prev_char_was_letter = 1;
        }
        else if (!is_alpha (character)) {
            prev_char_was_letter = 0;
        }
        character = fgetc (file_ptr);
    }
    printf ("%d\n", word_count);
    fclose (file_ptr);
}


 int main (void) { 
    FILE *file_ptr; 
    int c;
    int wCount = 0;
    
    file_ptr = fopen ("my_file.txt", "r");
    if (!file_ptr) {
        fprintf (stderr, "can't open file\n");
        return 1;
    }
    
    c = fgetc (file_ptr);
    while (c != EOF) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
           wCount++;
            while (1 != 0) {
                c = fgetc (file_ptr); 
                if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
                    break;
            }
        }
        c = fgetc(file_ptr);
    }
    printf("%d\n", wCount);
    fclose (file_ptr);
}


