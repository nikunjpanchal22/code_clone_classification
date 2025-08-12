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
		FILE *file;
		int ch, prev_lit = 0, wrd_count = 0;

		if( (file= fopen ("myfile.txt", "r")) ==NULL) {
		printf("cannot open file\n");
		return 1;
		}

		ch = fgetc (file);

		while (ch!= EOF) {
		if (isalpha(ch) && !prev_lit) {
		wrd_count++;
		prev_lit=1;
		}
		else if (!isalpha(ch)) {
		prev_lit=0;
		}
		ch = fgetc(file);
		}
		printf ("%d\n", wrd_count);
		fclose(file);
}


