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
    char *first, *last, *ptr;
    first = strtok(str, " ,.-");
    last = strtok(NULL, " ,.-");
    if (last == NULL){
        last ="";
    }
    printf("%s, %s\n", last, first);
    return 0;
}


