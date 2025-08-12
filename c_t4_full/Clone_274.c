void main () {
    fp = fopen ("26.txt", "r");
    char buffer [128];
    int a [100];
    int i = 0;
    freopen ("26.txt", "r", stdin);
    while (scanf ("%i", &a[i]) == 1 && buffer[i] != EOF)
        ++i;
    for (int j = 0; j < i; ++j)
        printf ("[%i]: %i\n", j, a[j]);
    fclose (stdin);
}



void main () {
    int a[100], i = 0;
    FILE *fp = fopen ("26.txt", "r");
    while (fscanf (fp, "%i", &a[i]) == 1) 
        ++i;
    for (int j = 0; j < i; ++j) 
        printf ("[%i]: %i\n", j, a[j]);
    fclose (fp);
}


