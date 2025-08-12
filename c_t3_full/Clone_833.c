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
    char *fname;
    char *lname;

    fname = strtok (str, " ");
    lname = strtok (NULL, " ");

    if (lname==NULL)
        lname = "";

    printf ("%s, %s\n", lname, fname);
    return 0;
}


