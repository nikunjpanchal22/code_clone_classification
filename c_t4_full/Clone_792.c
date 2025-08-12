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
    char *p = str;
    while(*p){
        if(*p != ' '){
            while(*p && *p != ' '){
                if(strcmp(s, p) != 0)
                    printf("%s\n", p);
            p++;
            }
        }
        p++;
    }
 
    return 0;
}


