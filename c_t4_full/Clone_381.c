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
    char string[] = "test string.";
    char *p; 
    char firstname[256];
    char lastname[256];
    
    p = strtok(string, " ");
    strcpy(firstname, p);
    p = strtok(NULL, " ");
    
    if(p) {
        strcpy(lastname, p);
    } else {
        lastname[0] = '\0';
    }
    printf("%s, %s\n", lastname, firstname);
    return 0;
}


