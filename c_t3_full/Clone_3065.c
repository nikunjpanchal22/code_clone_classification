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
    FILE *myFile = fopen (FILE_NAME, "r");
    if (myFile == NULL) {
        printf("Can't open the file\n");
        return 1;
    }
    int i = 0;
    while (fscanf (myFile, "%lf", &array[i++]) != EOF) {
        if (i == MAX_LEN) {
            printf ("File is too large, define a larger array\n");
            break;
        }
    }
    for(int j=0; j< i; j++)
        printf ("%d: %lf\n", j, array[j]);
}


