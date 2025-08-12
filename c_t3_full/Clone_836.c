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
    char *firstN;
    char *lastN;

    firstN = strtok (str, " ");
    lastN = strtok (NULL, " ");

    if (lastN==NULL)
        lastN = "";

    printf ("%s, %s\n", lastN, firstN);
    return 0;
}


