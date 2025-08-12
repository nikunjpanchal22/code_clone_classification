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
    char *line;
    double num;
    size_t n = 0;
    size_t len = 0;
    int i = 0;
    double *arr = malloc(sizeof(double)*200);
    fp = fopen ("g.txt", "r");
    if (fp == NULL) {
        printf ("Error opening");
        free(arr);
        exit (EXIT_FAILURE);
    }
    while ((getline(&line, &n, fp) != -1)) {
        if(i < 200) {
            sscanf(line, "%lf", &num);
            arr[i++] = num;
        }
    }
    for(int k = 0; k < i; k++)
       printf ("%f\n", arr[k]);
    free(arr);
    fclose(fp);
    return 0;
}


