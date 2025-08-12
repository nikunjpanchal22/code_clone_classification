int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL) {
        return 1;
    }
    int nr = atoi (second_part);
    printf ("%d\n", nr);
    return 0;
}


 int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = malloc(strlen(str) + 1);
    char * const second_part = malloc(strlen(str) + 1);
    char *p = strchr(str, '-'); 
    int i;
    int nr;
 
    for(i=0; i<p-str; i++){
        *(first_part+i) = *(str+i);
    }
    *(first_part+i) = '\0';
 
    for(i=0; i<strlen(str)-(p-str)-1; i++){
        *(second_part+i) = *(p+1+i);
    }
    *(second_part+i) = '\0';
 
    nr = atoi (second_part);
    printf ("%d\n", nr);
 
    free(first_part);
    free(second_part);
 
    return 0;
}


