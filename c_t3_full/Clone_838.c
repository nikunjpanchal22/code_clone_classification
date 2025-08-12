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
    char *fn;
    char *ln;

    fn = strtok (str, " ");
    ln = strtok (NULL, " ");

    if (!ln)
        ln = "";

    printf ("%s, %s\n", ln, fn);
    return 0;
}


