int main () {
    char *name;
    char *altname;
    name = (char *) malloc (60 * sizeof (char));
    name = "Hello World!";
    altname = name;
    printf ("%s  \n", altname);
    altname = NULL;
    altname = (char *) malloc (sizeof (name));
    strcpy (altname, name);
    printf ("%s  \n", altname);
    return 1;
}



int main() {
    char *name;
    name = (char *)malloc((60 * sizeof(char)) + 1);
    strcpy(name, "Hello World!");
    char *altname;
    altname = (char *)malloc(strlen(name) + 1);
    strcpy(altname, name);
    printf("%s  \n", altname);
    free(altname);
    altname = NULL;
    altname = (char *)malloc(strlen(name) + 1);
    altname = name;
    printf("%s  \n", altname);
    free(altname);
    altname = NULL;
    return 1;
}


