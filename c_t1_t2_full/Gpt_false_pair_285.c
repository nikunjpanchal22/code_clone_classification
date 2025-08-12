int main () {
    FILE *fp = NULL;
    int read = 0;
    int i = 0;
    char *token = NULL;
    char buffer [MAXVAL] = {0};
    float bufferFloat [10] = {0};
    fp = fopen ("Xvalues.txt", "r");
    if (fp == NULL) {
        printf ("error opening the file");
        return -1;
    }
    if (!fgets (buffer, MAXVAL, fp)) {
        printf ("error reading the file");
        return -2;
    }
    const char *s = " \n";
    token = strtok (buffer, s);
    i = 0;
    while (token != NULL) {
        bufferFloat[i++] = strtof (token, NULL);
        token = strtok (NULL, s);
    }
    for (i = 0; i < 10; i++) {
        printf ("float values are%f\n", bufferFloat [i]);
    }
    fclose (fp);
    return 0;
}


 int main () {
    FILE *fp = NULL;
    int read = 0;
    int i = 0;
    char *token = NULL;
    char buffer [MAXVAL] = {0};
    float bufferFloat [10] = {.0};
    fp = fopen ("Xvalues.txt", "r");
    if (fp == NULL) {
        printf ("Error opening the file\n");
        return -1;
    }
    if (!fread (buffer, sizeof(char), MAXVAL, fp)) {
        printf ("Error reading the file\n");
        return -2;
    }
    const char *s = " \t\n";
    token = strtok (buffer, s);
    i = 0;
    while (token != NULL) {
        bufferFloat[i++] = atof (token);
        token = strtok (NULL, s);
    }
    for (i = 0; i < 10; i++) {
        printf ("Float values are %f\n", bufferFloat [i]);
    }
    fclose (fp);
    return 0;
}
