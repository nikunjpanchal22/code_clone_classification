int main (void) {
    char username [16];
    char text [512];
    int ch, i;
    FILE *my_file = fopen ("inbox.txt", "r");
    while (1 == fscanf (my_file, "%15s%*c", username)) {
        i = 0;
        while (i < sizeof (text) - 1 && EOF != (ch = fgetc (my_file))) {
            if (ch == '\n' && i && text[i - 1] == '\n')
                break;
            text[i++] = ch;
        }
        text[i] = 0;
        printf ("user:%s\n", username);
        printf ("text:\n%s\n", text);
    }
    fclose (my_file);
    return 0;
}


 int main (void) {
	    char username[16];
	    char text[512];
	    int ch;
	    int i;
	    FILE * my_file;

	    //open the file to be read
	    my_file = fopen("inbox.txt", "r");

	    //scan for the user name
	    while (fscanf(my_file, "%15s%*c", username) == 1){
		i = 0; 
		//get the characters from the file
		while ((ch = fgetc(my_file)) && i < sizeof(text)-1) {
		    //when there is a '\n' character and it is not the first character
		    if (ch == '\n' && i && text[i-1] == '\n') {
		        break; 
		    }
		    else{
		        text[i++] = ch;
		    }
		}
		text[i] = '\0'; // set last character to null
		printf("user: %s\n", username); //print username
	    	printf("text: \n%s\n", text); // print message
	    }
	    //close file
	    fclose(my_file);
	    return 0;
}


