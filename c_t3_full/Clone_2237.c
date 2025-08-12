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





#include<stdio.h>
#include<ctype.h>

int main() {
		FILE *file;
		int c, prev = 0, count = 0;
		if( (file = fopen ("mfile.txt", "r")) == NULL) {
		printf("can't open file\n");
		return -1;
		}

		c = fgetc(file);

		while(c != EOF){
		if(isalpha(c) && !prev){
		count++;
		prev = 1;
		}
		else if(!isalpha(c)) prev = 0;
		c = fgetc(file);
		}
		printf("%d", count);
		fclose(file);
		return 0;
}


