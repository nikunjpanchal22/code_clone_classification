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
    int current_character;
    int last_character_was_letter = 0;
    int word_count_total = 0;
    file_ptr = fopen("my_file.txt", "r");
    if (!file_ptr) {
        fprintf (stderr, "Unable to open file.\n");
        return 1;
    }
    current_character = fgetc(file_ptr);
    while (current_character != EOF) {
        if (is_alpha(current_character) && last_character_was_letter != 1) {
            word_count_total++;
            last_character_was_letter = 1;
        }
        else if (!is_alpha(current_character)) {
            last_character_was_letter = 0;
        }
        current_character = fgetc(file_ptr);
    }
    printf ("%d\n", word_count_total);
    fclose(file_ptr);
}
