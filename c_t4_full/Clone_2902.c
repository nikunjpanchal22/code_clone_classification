int main (void) {
    FILE *fp;
    char *line = NULL;
    size_t len = 0;
    ssize_t read;
    const char *s = " ";
    char *token = NULL;
    int i = 0;
    double arr [200];
    int j;
    fp = fopen ("g.txt", "r");
    if (fp == NULL) {
        printf ("Error opening");
        exit (EXIT_FAILURE);
    }
    while ((read = getline (&line, &len, fp)) != -1) {
        token = strtok (line, s);
        while (token != NULL) {
            arr[i] = atoi (token);
            printf ("%f\n", arr [i]);
            token = strtok (NULL, s);
            i++;
        }
    }
    exit (EXIT_SUCCESS);
    return 0;
}






#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *fp;
    int i = 0;
    double arr[200];
    fp = fopen ("g.txt", "r");
    if (fp == NULL) {
        printf ("Error opening");
        exit (EXIT_FAILURE);
    }
    while (fscanf(fp, "%lf", &arr[i]) != EOF) {
        printf ("%f\n", arr[i]);
        i++;
    }
    fclose(fp);
    return 0;
}


