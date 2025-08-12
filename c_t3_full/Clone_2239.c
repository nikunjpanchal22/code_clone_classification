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
		FILE *fp;
		int charChk, last_alpha = 0, wordCount = 0;
		fp = fopen("myFile.txt", "r");

		if(fp == NULL) {
		fputs("File not found.", stderr);
		return 1;
		}

		charChk = fgetc(fp);

		while(charChk != EOF) {
		if(isalpha(charChk) && !last_alpha) {
		wordCount++;
		last_alpha = 1;
		} else if(!isalpha(charChk)) {
		last_alpha = 0;
		}
		charChk = fgetc(fp);
		}

		printf("%d", wordCount);
		fclose(fp);
}


