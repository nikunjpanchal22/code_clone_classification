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



 

#include <stdio.h>
#include <ctype.h>

int main () {
		FILE *f;
		int c, last_is_alpha = 0, words = 0;
		f = fopen ("myfile.doc", "r");

		if (!f) {
		perror ("Error opening file\n");
		return 1;
		}

		c = fgetc(f);

		while( c != EOF) {
		if ( isalpha(c) && !last_is_alpha) {
		words++;
		last_is_alpha =1;
		} else if( !isalpha(c) ) {
		last_is_alpha = 0;
		}
		c = fgetc(f);
		}
		printf ("%d\n", words);
		fclose(f);
		return 0;
}


