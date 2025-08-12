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
    char firstname[256];
    char lastname[256];

    p = strtok(str, " ");
    strncpy(firstname, p,strlen(str));
    p = strtok(NULL, " ");
    strncpy(lastname, p,strlen(str));

    if(p == NULL){
        lastname[0] = '\0';
    }

    printf("%s, %s\n", lastname, firstname);
    return 0;
}


