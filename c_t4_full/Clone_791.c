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
    char str[] = "foo $$ foo ## foo []";
    char *s = "foo";
    char str_new[100];
    int i, j;
    i=j=0;
    while(str[i])
    {
        if(str[i]!=' ')
            str_new[j++]=str[i];
        else
        {
            str_new[j]='\0';
            if(strcmp(s, str_new)!=0)
                printf("%s\n", str_new);
            j=0;
        }
        i++;
    }
    return 0;
}


