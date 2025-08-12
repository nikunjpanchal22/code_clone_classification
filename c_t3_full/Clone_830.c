int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}


 
int main () {
    char str [] = "test string.";
    char *initial;
    char *last;

    initial = strtok (str, " ");
    last = strtok (NULL, " ");

    if (!last)
        last = "";

    printf ("%s, %s\n", last, initial);
    return 0;
}


