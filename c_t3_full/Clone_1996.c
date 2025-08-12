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

	  //open the file for reading
	  my_file = fopen("inbox.txt", "r");

	  //scan for the user name from the file
	  while (fscanf(my_file, "%15s%*c", username) == 1) {
	    i = 0; 
	    //get the characters from the file
	    while (i < sizeof(text)-1 && (ch = fgetc(my_file)) != EOF) {
	      if (ch == '\n' && i && text[i-1] == '\n') {
		break; 
	      }
	      else{
		//add the characters to the text array 
		text[i++] = ch;
	      }
	    }
	    text[i] = '\0'; // setting the last character to the null character
	    printf("user: %s\n", username); //print the user name
	    printf("text: \n%s\n", text); // print the message
	  }
	 
	  //closing the file
	  fclose(my_file);

	  return 0;
}


