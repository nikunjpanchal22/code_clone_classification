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
    
    // use an array of strings to store each word
    string tab[20]; 
    // use a stringstream to tokenize the string
    stringstream ss(line); 
    string token;  
    // keeps storing words in array until end 
    int count = 0; 
    while (getline(ss, token, ' ')) { 
        tab[count++] = token; 
    } 
    // set the last element character to null byte
    tab[count - 1].pop_back();
    // print the words in reverse order
    for (int i = count - 1; i >= 0; i--) { 
        printf("%s ", tab[i].c_str()); 
    }
    printf("\n");
    return 0; 
}


