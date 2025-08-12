int main () {
    char string [100];
    int i, j;
    printf ("\nEnter string: ");
    gets (string);
    if (isalpha (string[0])) {
        string[0] = toupper (string[0]);
        for (i = 1; i < strlen (string); i++) {
            if (string[i - 1] == ' ' && isalnum (string[i]))
                string[i] = toupper (string[i]);
        }
        i = strlen (string);
        while (i) {
		int j = i;
		while (j && j != ' ')
		    j--;
		printf ("%.*s ", i - j, string + j);
		i = j;
	    }
	    
	}
}


 int main () {
    char text [100];
    int i, j;
    printf ("\nWrite a string to capitalize: ");
    gets (text);
    if (islower (text[0])) {
        text[0] = toupper (text[0]);
        for (i = 1; i < strlen (text); i++) {
            if (text[i - 1] == ' ' && isalnum (text[i]))
                text[i] = toupper (text[i]);
        }
        i = strlen (text);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, text + j);
        i = j;
    }
    }
    return 0;
}
