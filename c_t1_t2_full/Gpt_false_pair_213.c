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
    char words [100];
    int i, j;
    printf ("\nPlease enter a phrase: ");
    gets (words);
    if (islower (words[0])) {
        words[0] = toupper (words[0]);
        for (i = 1; i < strlen (words); i++) {
            if (words[i - 1] == ' ' && isalnum (words[i]))
                words[i] = toupper (words[i]);
        }
        i = strlen (words);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, words + j);
        i = j;
    }
    }
    return 0;
}
