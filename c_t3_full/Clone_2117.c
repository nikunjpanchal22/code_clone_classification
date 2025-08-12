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
    FILE *in = NULL;
    int idx = 0;
    float val [10];
    char txt [MAXVAL] = {0}, *tkn = NULL;
    if (!(in = fopen ("Xvalues.txt", "r")))
    {
        printf ("Fail to open file.");
        return -1;
    }
    if (!fgets (txt, MAXVAL, in))
    {
        printf ("Fail to read file.");
        return -2;
    }
    tkn = strtok (txt, " \n");
    while (tkn != NULL)
    {
        val[idx++] = strtof (tkn, NULL);
        tkn = strtok (NULL, " \n");
    }
    for (idx = 0; idx < 10; idx++)
        printf ("float values are %f\n", val[idx]);
    fclose (in);
    return 0;
}


