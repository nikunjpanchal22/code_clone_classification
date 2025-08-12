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
    char sentence [100];
    int i, j;
    printf ("\nGive me a sentence to capitalize: ");
    gets (sentence);
    if (islower (sentence[0])) {
        sentence[0] = toupper (sentence[0]);
        for (i = 1; i < strlen (sentence); i++) {
            if (sentence[i - 1] == ' ' && isalnum (sentence[i]))
                sentence[i] = toupper (sentence[i]);
        }
        i = strlen (sentence);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, sentence + j);
        i = j;
    }
    }
    return 0;
}
