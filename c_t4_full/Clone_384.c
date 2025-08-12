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
    char *ptr_str = str;
    //ptr_str is the pointer to the beginning of the string
    char *ptr_token = str;
    //ptr_token is the pointer for finding each token
    for (int j = 0; j < nLength; ++j) {
        if (*(ptr_str + j) == ' ') {
            char *token = (char*) malloc (j - iIndex + 1);
            strncpy (token, ptr_token, j - iIndex);
            token[j - iIndex] = '\0';
            names [iIndex] = token;
            ptr_token = ptr_token + (j - iIndex + 1);
            iIndex++;
        }
    }
    if ((nLength - (ptr_token - str)) > 0) {
        names[iIndex] = (char*) malloc (nLength - (ptr_token - str) + 1);
        strncpy (names[iIndex], ptr_token, nLength - (ptr_token - str));
        names[iIndex][nLength - (ptr_token - str)] = '\0';
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


