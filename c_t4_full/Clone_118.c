int main (void) {
    int index;
    char wordToPrint [SIZE];
    printf ("please enter a random word:\n");
    for (index = 0; index < SIZE; index++) {
        scanf ("%c", & wordToPrint [index]);
    }
    int len = strlen (wordToPrint);
    for (index = 0; index < SIZE; index++) {
        --len;
        printf ("%c", wordToPrint [len - 1]);
    }
    return 0;
}


 int main (void) { 
    char wordToPrint [SIZE];
    printf ("please enter a random word:\n");
    scanf ("%s", wordToPrint); 
    int len = strlen (wordToPrint) - 1;
    char tmp[len];
    int index = 0;
    while(len >= 0){
        tmp[index] = wordToPrint[len];
        index++;
        len--;
    }  
    printf("%s", tmp);
    return 0;
}


