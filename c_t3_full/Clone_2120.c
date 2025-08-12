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
    int n = 0;
    float arr [10] = {0};
    char str [MAXVAL] = {0}, *pt = NULL;
    if (!(f = fopen ("Xvalues.txt", "r")))
    {
        printf ("Error: cannot open file!");
        return -1;
    }
    if (!fgets (str, MAXVAL, f))
    {
        printf ("Error: cannot read file!");
        return -2;
    }
    pt = strtok (str, " \n");
    while (pt != NULL)
    {
        arr[n++] = strtof (pt, NULL);
        pt = strtok (NULL, " \n");
    }
    for (n = 0; n < 10; n++)
        printf ("float values are %f\n", arr[n]);
    fclose (f);
    return 0;
}


