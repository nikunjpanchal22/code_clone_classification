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




#include <stdio.h>
void main () {
    FILE* fp = fopen ("26.txt", "r");
    int a [100];
    int i = 0;
    int x;
    while ((x = fscanf (fp, "%i", &a[i])) != EOF)
        if (x == 1)
            ++i;
    for (int j = 0; j < i; ++j)
        printf ("Element[%i]: %i\n", j, a[j]);
}


