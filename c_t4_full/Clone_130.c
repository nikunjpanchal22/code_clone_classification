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
    char * const first_part = (char*)malloc(sizeof(char));
    char * const second_part = (char*)malloc(sizeof(char));
    char * pch;
    int nr;
    pch = strtok(str,"-");
    int i = 0;

    while (pch != NULL){
        if (i == 0){
            first_part = pch;
        }else if(i == 1){
            second_part = pch;
        }
        i++;
        pch = strtok(NULL, "-");
    }
    nr = atoi (second_part);
    printf ("%d\n", nr);
    free(first_part); 
    free(second_part);
    return 0;
}


