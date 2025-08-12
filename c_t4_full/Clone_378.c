int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}


 int main(){
    char str[] = "test string.";
    char first[100], last[100];
    char *p;
    int i = 0;
    p = strtok(str, " ");
    while(p != NULL){
        if(i == 0){
            strcpy(first, p);
        } else {
            strcpy(last, p);
        }
        p = strtok(NULL, " ");
        i++;
    }

    if(i == 1)
        last[0] = '\0';
    printf("%s, %s\n", last, first);
    return 0;
}


