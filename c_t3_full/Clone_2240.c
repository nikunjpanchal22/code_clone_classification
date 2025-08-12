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
		FILE *myFile;
		int charCount, lastChar = 0, word = 0;
		if((myFile = fopen("myFile.txt", "r")) == NULL) {
		printf("File not opened");
		return 1;
		}
		charCount = fgetc(myFile);

		while(charCount != EOF) {
		if(isalpha(charCount) && lastChar == 0) {
		word++;
		lastChar = 1;
		} else if(!isalpha(charCount)) {
		lastChar = 0;
		}
		charCount = fgetc(myFile);
		}
		printf("%d", word);
		fclose(myFile);
}


