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
    int characters;
    int wordCount = 0;
    file_ptr = fopen("my_file.txt", "r");
    
    if(!file_ptr) {
        fprintf(stderr, "Can't open file \n");
        return 1; 
    } 
       
    characters = fgetc(file_ptr);
    while (characters != EOF) {
        if ((characters >= 'a' && characters <= 'z') || (characters >= 'A' && characters <= 'Z')) {
            wordCount++;
            characters = fgetc(file_ptr); 
            while ((characters >= 'a' && characters <= 'z') || (characters >= 'A' && characters <= 'Z'))
                characters = fgetc(file_ptr);
        }
        else 
            characters = fgetc(file_ptr);
    }
    printf("%d\n", wordCount); 
    fclose(file_ptr); 
}


