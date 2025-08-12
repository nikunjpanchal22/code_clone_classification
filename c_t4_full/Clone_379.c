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
    char *p;
    char first[100], last[100];
    int i = 0;

    p = strtok(str, " ");
    while(p != NULL){
        if(i == 0){
            strncpy(first, p,strlen(str));
        } else {
            strncpy(last, p, strlen(str));
        }
        p = strtok(NULL, " ");
        i++;
    }

    if(i == 1){
        last[0] = '\0';
    }

    printf("%s, %s\n", last, first);
    return 0;
}


