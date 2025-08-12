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





int main ()
{
    FILE *f = NULL;
    int i = 0;
    float arr [10];
    char txt [MAXVAL] = {0}, *tok = NULL;
    if (!(f = fopen ("Xvalues.txt", "r")))
    {
        printf ("File open error");
        return -1;
    }
    if (!fgets (txt, MAXVAL, f))
    {
        printf ("File read error");
        return -2;
    }
    tok = strtok (txt, " \n");
    while (tok != NULL)
    {
        arr[i++] = strtof (tok, NULL);
        tok = strtok (NULL, " \n");
    }
    for (i = 0; i < 10; i++)
        printf ("float values: %f\n", arr[i]);
    fclose (f);
    return 0;
}


