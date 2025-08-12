int main () {
    char months [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char **tokens;
    printf ("months=[%s]\n\n", months);
    tokens = str_split (months, ',');
    if (tokens) {
        int i;
        for (i = 0; *(tokens + i); i++) {
            printf ("month=[%s]\n", * (tokens + i));
            free (* (tokens + i));
        }
        printf ("\n");
        free (tokens);
    }
    return 0;
}


 
int main () {
    char months [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char *tmp, **tokens;
    int len;
    
    printf ("months=[%s]\n\n", months);
    for (len = 0, tmp = months; *tmp; tmp++) 
        if (*tmp == ',') 
            len++;
    tokens = malloc(sizeof(char*) * (len + 2));
	tokens[len + 1] = 0;
	
	tmp = strtok(months, ",");
	for (int i = 0; tmp != NULL; i++) {
		int l = strlen(tmp);
		tokens[i] = malloc(l + 1);
		strcpy(tokens[i], tmp);
		printf ("month=[%s]\n", tokens[i]);
		tmp = strtok(NULL, ",");
	}
	printf ("\n");
	
	for (int i = 0; i <= len; i++) 
		free(tokens[i]);
	free(tokens);
    
    return 0;
}


