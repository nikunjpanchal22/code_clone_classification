int main () {
    double array [MAX_LEN];
    FILE *fp = fopen (FILE_NAME, "r");
    if (!fp) {
        perror ("Can Not Open The File");
        return 1;
    }
    int i = 0;
    while (fscanf (fp, "%lf", &array[i++]) != EOF) {
        if (i == MAX_LEN) {
            printf ("The file is huge, you should define larger array");
            break;
        }
    }
    int j = 0;
    while (j < i)
        printf ("%d: %lf\n", j, array[j++]);
}




#include<stdio.h>
#define MAX_LEN 100
#define FILE_NAME "numbers.txt"

int main () {
    double array [MAX_LEN];
    FILE *fp = fopen (FILE_NAME, "r");
    if (!fp) {
        perror ("Failure Opening File");
        return 1;
    }
    int i = 0;
    while (fscanf (fp, "%lf", &array[i++]) != EOF) {
        if (i >= MAX_LEN) {
            printf ("File too large, increase array size");
            break;
        }
    }
    for(int j=0; j< i; j++)
        printf ("%d: %lf\n", j, array[j]);
}


