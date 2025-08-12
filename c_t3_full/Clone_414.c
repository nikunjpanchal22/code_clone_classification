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
    int character; 
    int prev_char_was_letter = 0;
    int word_count = 0;
    file_ptr = fopen ("my_file.txt", "r");
    if (!file_ptr) {
        fprintf (stderr, "can't open file\n"); 
        return 1;
    }
    while ((character = fgetc (file_ptr)) != EOF) {
        if (character >= 65 && character <= 90) {
            if(prev_char_was_letter != 1) {
                word_count++; 
            }
            prev_char_was_letter = 1;
        }
        else if (character >= 97 && character <=122) {
            if(prev_char_was_letter != 1) {
                word_count++; 
            }
            prev_char_was_letter = 1; 
        }
        else {
            prev_char_was_letter = 0; 
        }
    }
    printf ("%d\n", word_count); 
    fclose (file_ptr); 
}


