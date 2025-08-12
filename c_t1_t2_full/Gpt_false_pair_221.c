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
    char stringToChange [100];
    int i, j;
    printf ("\nEnter a string: ");
    gets (stringToChange);
    if (islower (stringToChange[0])) {
        stringToChange[0] = toupper (stringToChange[0]);
        for (i = 1; i < strlen (stringToChange); i++) {
            if (stringToChange[i - 1] == ' ' && isalnum (stringToChange[i]))
                stringToChange[i] = toupper (stringToChange[i]);
        }
        i = strlen (stringToChange);
        while (i) {int j = i;
        while (j && j != ' ')
            j--;
        printf ("%.*s ", i - j, stringToChange + j);
        i = j;
    }
    }
    return 0;
}
