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
    FILE *filep = NULL;
    int num = 0;
    double nums [10];
    char text [MAXVAL] = {0}, *toks = NULL;
    if (!(filep = fopen ("Xvalues.txt", "r")))
    {
        printf ("Fail to open the file");
        return -1;
    }
    if (!fgets (text, MAXVAL, filep))
    {
        printf ("Fail to read the file");
        return -2;
    }
    toks = strtok (text, " \n");
    while (toks != NULL)
    {
        nums[num++] = strtof (toks, NULL);
        toks = strtok (NULL, " \n");
    }
    for (num = 0; num < 10; num++)
        printf ("The values are %f\n", nums[num]);
    fclose (filep);
    return 0;
}


