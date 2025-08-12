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


 int main ( void ) {
    FILE *fp; 
    int characters, count = 0; 
    
    fp = fopen("my_file.txt", "r+"); //opens the file for reading and writing
    
    if (fp == NULL) {
        fprintf( stderr, "Can't open file \n");
        return 1;
    }
    
    while ( (characters = fgetc(fp)) != EOF ) { 
        if ( (characters > 64 && characters < 91) || (characters > 96 && characters < 123)) {
            count++; 
            while(1 != 0) {
                characters = fgetc(fp);
                if ( !( (characters > 64 && characters < 91) || (characters > 96 && characters < 123))) {
                    break;
                }
            } 
        } 
    }

    printf("%d\n",count);
    fclose(fp); 
}


