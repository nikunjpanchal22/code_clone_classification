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
    char *p = months, tmp[128], month[128];
    int i;
    
    printf ("months=[%s]\n\n", months);
    sprintf(tmp, "%s", p);
    i=0;
    while (p!=NULL && sscanf(tmp, "%[^,],%s", month,tmp) == 2) {
    	printf ("month=[%s]\n", month);
    	strcpy(months, tmp);
		p = months;
    }
    
    printf ("\n");
    return 0;
}


