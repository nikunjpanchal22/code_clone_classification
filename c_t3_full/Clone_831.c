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
    char *first_name;
    char *last_name;

    first_name = strtok (str, " ");
    last_name = strtok (NULL, " ");

    if (!last_name)
        last_name = "";

    printf ("%s, %s\n", last_name, first_name);
    return 0;
}


