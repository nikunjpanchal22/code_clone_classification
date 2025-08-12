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
    char line [100];
    int i, j;
    printf ("\nInput line to capitalize: ");
    gets (line);
    if (islower (line[0])) {
        line[0] = toupper (line[0]);
        for (i = 1; i < strlen (line); i++) {
            if (line[i - 1] == ' ' && isalnum (line[i]))
                line[i] = toupper (line[i]);
        }
        i = strlen (line);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, line + j);
        i = j;
    }
    }
    return 0;
}
