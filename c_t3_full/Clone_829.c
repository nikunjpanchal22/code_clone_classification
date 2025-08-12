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
    char *fstname;
    char *lstname;

    fstname = strtok (str, " ");
    lstname = strtok (NULL, " ");

    if (lstname == NULL)
        lstname = "";

   printf ("%s, %s\n", lstname, fstname);
    return 0;
}


