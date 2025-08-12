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
    FILE *inf = NULL;
    int counter = 0;
    float data [10];
    char junk [MAXVAL] = {0}, *tmp = NULL;
    if (!(inf = fopen ("Xvalues.txt", "r")))
    {
        printf ("Fail to open file.");
        return -1;
    }
    if (!fgets (junk, MAXVAL, inf))
    {
        printf ("Fail to read file.");
        return -2;
    }
    tmp = strtok (junk, " \n");
    while (tmp != NULL)
    {
        data[counter++] = strtof (tmp, NULL);
        tmp = strtok (NULL, " \n");
    }
    for (counter = 0; counter < 10; counter++)
        printf ("float values are %f\n", data[counter]);
    fclose (inf);
    return 0;
}


