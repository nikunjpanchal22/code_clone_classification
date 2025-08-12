int main (void) {
    FILE *fp = NULL;
    if (NULL == (fp = fopen (FILE_NAME, "r"))) {
        perror ("fopen failed");
        exit (EXIT_FAILURE);
    }
    int i = 0;
    while (fgets (words[i], MAX_COLUMNS, fp)) {
        words[i][strlen (words[i]) - 1] = '\0';
        i++;
    }
    bubbleSortWordsArray (i);
    printWordsArray (i);
    return (0);
}


int main (void) {
    FILE *fp = NULL;
    if (NULL == (fp = fopen (FILE_NAME, "r"))) {
        perror ("fopen failed");
        exit (EXIT_FAILURE);
    }
    int i = 0;
    while (fgets (words[i], MAX_COLUMNS, fp) && i < MAX_WORDS) {
        words[i][strlen (words[i]) - 1] = '\0';
        i++;
    }
    if (i > 0) {
        bubbleSortWordsArray (i);
        printWordsArray (i);
    }
    return (0);
}
