int main (int argc, char *argv []) {
    char line [100];
    fgets (line, 100, stdin);
    char *tab [20];
    char *p = NULL;
    p = strtok (line, " ");
    int nb = -1;
    while (p != NULL) {
        nb++;
        tab[nb] = malloc (sizeof (char) * 100);
        strcpy (tab [nb], p);
        p = strtok (NULL, " ");
    }
    tab[nb][strlen (tab[nb]) - 1] = '\0';
    int i;
    for (i = nb; i >= 0; i--) {
        printf ("%s ", tab [i]);
        free (tab [i]);
    }
    printf ("\n");
    return 0;
}


 int main(int argc, char *argv[]) { 
    char line[100];
    fgets(line, 100, stdin); 
    
    // use an array to store each word
    char *tab[20]; 
    // use strtok to tokenize the string
    char *p = strtok(line, " "); 
    int count = 0;
     // keeps storing words in array until end 
    while (p != NULL) {
        tab[count++] = p;
        p = strtok(NULL, " ");
    }
    // set the last element character to null byte
    tab[count - 1][strlen(tab[count - 1]) - 1] = '\0';
    // print the words in reverse order
    for (int i = count - 1; i >= 0; i--) { 
        printf("%s ", tab[i]); 
    }
    printf("\n");
    return 0; 
}


