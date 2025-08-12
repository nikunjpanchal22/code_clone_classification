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

int main(){
		FILE *p;
		int c, w_count = 0, p_w = 0;
		p = fopen("text.txt","r");
		if(!p){
		printf("Unable to open file\n");
		return 1;
		}
		c = fgetc(p);
		while(c != EOF){
		if(isalpha(c) && p_w == 0){
		w_count++;
		p_w = 1;
		} else if(!isalpha(c)){
		p_w = 0;
		}
		c = fgetc(p);
		}
		printf("%d", w_count);
		fclose(p);
}


