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
    char charString [100];
    int i, j;
    printf ("\nEnter string to capitalize: ");
    gets (charString);
    if (islower (charString[0])) {
        charString[0] = toupper (charString[0]);
        for (i = 1; i < strlen (charString); i++) {
            if (charString[i - 1] == ' ' && isalnum (charString[i]))
                charString[i] = toupper (charString[i]);
        }
        i = strlen (charString);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, charString + j);
        i = j;
    }
    }
    return 0;
}
