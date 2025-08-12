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
    char **tokens;
    char delmtr = ',';
    int size = strlen(months);
    printf ("months=[%s]\n\n", months);

    tokens = malloc((sizeof(char*) * size) + 1);
    
    int j = 0;
    for (int i = 0; i < size; i++){
        if (months[i] == delmtr || i == size-1){
			int indx;
			
			if (i == size-1){
				indx = i+1;
			} else{
            	indx = i;
			}
            tokens[j] = malloc(indx - iterator + 1);
            memcpy(tokens[j], &months[iterator], indx - iterator);
			tokens[j][indx - iterator] = '\0';
            j++;
            iterator = i + 1;
        }
    }
    tokens[j] = NULL;
    for(int i = 0; tokens[i]!=NULL; i++){
        printf ("month=[%s]\n", tokens[i]);
        free(tokens[i]);
    }
    printf ("\n");
    free(tokens);
    
    return 0;
}


