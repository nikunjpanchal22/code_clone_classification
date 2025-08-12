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
    char *firName;
    char *lasName;

    firName = strtok (str, " ");
    lasName = strtok (NULL, " ");

    if (lasName==NULL)
        lasName = "";

    printf ("%s, %s\n", lasName, firName);
    return 0;
}


