int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    char *p;
    p = strtok (str, " ");
    while (p != NULL) {
        if (strcmp (p, s))
            printf ("%s\n", p);
        p = strtok (NULL, " ");
    }
    return 0;
}


 int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    int i;
    for(i=0;i<strlen(str);i++){
    	if(str[i]==' ')
        {
        	if(strncmp(str+i+1,s,strlen(s))!=0)
	            printf("%s\n",str+i+1);
        }
    }
    return 0;
}


