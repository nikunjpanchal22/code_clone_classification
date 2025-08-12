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
    char *names [MAX_NAMES] = { 0 };
    int i = 0;
    char *ptr_str = &str[0];
    //ptr_str is the pointer to the beginning of the string
    char *ptr_token = &str[0];
    //ptr_token is the pointer for finding each token
    for (int j = 0; j < strlen (str); ++j) {
        if (*(ptr_str + j) == ' ') {
            char *token = (char*) malloc (j - i + 1);
            strncpy (token, ptr_token, j - i);
            token[j - i] = '\0';
            names [i] = token;
            ptr_token = ptr_token + (j - i + 1);
            i++;
        }
    }
    if ((strlen (str) - (ptr_token - &str[0])) > 0) {
        names[i] = (char*) malloc (strlen (str) - (ptr_token - &str[0]) + 1);
        strncpy (names[i], ptr_token, strlen (str) - (ptr_token - &str[0]));
        names[i][strlen (str) - (ptr_token - &str[0])] = '\0';
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


