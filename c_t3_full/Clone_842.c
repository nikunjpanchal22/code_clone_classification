int main () {
    char str [] = "test string.";
    char *names [MAX_NAMES] = {0};
    char *test;
    int i = 0;
    test = strtok (str, " ");
    while (test != NULL && i < MAX_NAMES) {
        names[i] = malloc (strlen (test) +1);
        strcpy (names [i ++], test);
        test = strtok (NULL, " ");
    }
    for (i = 0; i < MAX_NAMES; ++i) {
        if (names[i]) {
            puts (names [i]);
            free (names [i]);
            names[i] = 0;
        }
    }
    return 0;
}


 int main () {
    char str [] = "test string.";
    int nLength = strlen (str);
    char *names [MAX_NAMES] = { 0 };
    int iIndex = 0;
    char delimeter[] = " ";
    char pBuffer[nLength];
    strcpy (pBuffer, str);
    char *part = strtok (pBuffer, delimeter);
    while (part != NULL && iIndex < MAX_NAMES) {
        names[iIndex] = malloc (strlen (part) +1);
        for (int jIndex = 0; jIndex < strlen (part); ++jIndex) {
            names[iIndex][jIndex] = *(part + jIndex);
        }
        names[iIndex][strlen (part)] = '\0';
        part = strtok (NULL, delimeter);
        iIndex++;
    }
    for (iIndex = 0; iIndex < MAX_NAMES; ++iIndex) {
        if (names[iIndex]) {
            puts (names [iIndex]);
            free (names [iIndex]);
            names[iIndex] = 0;
        }
    }
    return 0;
}


