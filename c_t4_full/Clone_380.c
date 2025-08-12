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
    char firstname[256];
    char lastname[256];
    char *istr;

    istr = strtok(string, " ");
    
    while (istr != NULL) 
    {
        if(istr == string) {
            strcpy(firstname, istr);
        }
        else {
        strcpy(lastname, istr);
        }
        istr = strtok(NULL, " ");
    }
  
    if (lastname == NULL) 
        lastname = "";  
  
    printf("%s, %s\n", lastname, firstname); 
    return 0; 
}


