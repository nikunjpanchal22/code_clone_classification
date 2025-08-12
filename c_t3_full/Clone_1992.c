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
	  int ch, i; 
	  FILE *my_file;

	  //open file
	  my_file = fopen("inbox.txt", "r");

	  //read file
	  while (fscanf(my_file, "%15s%*c", username) == 1) {
	    i = 0; 
	    //get characters
	    while (i < sizeof(text)-1 && (ch = fgetc(my_file)) != EOF) {
	      // check for '\n'
	      if (ch == '\n' && i && text[i-1] == '\n') {
		break; 
	      }
	      else {
		// store characters in text array 
		text[i++] = ch;
	      }
	    }
	    text[i] = '\0'; // terminate the array with the null character
	    //print the user details
	    printf("user: %s\n", username);
	    printf("text: \n%s\n", text); 
	  }

	  //close the file
	  fclose(my_file);
	  return 0;

}


