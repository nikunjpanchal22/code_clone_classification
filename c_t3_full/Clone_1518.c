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


 
int main () {
    double array [MAX_LEN];
    FILE *fp = fopen (FILE_NAME, "r");
    if (!fp) {
        perror ("Can Not Open The File");
        return 1;
    }
    int i; 
    for (i = 0; i < MAX_LEN; ++i) {
        if (fscanf (fp, "%lf", &array[i]) == EOF) 
            break;
    }
    for (int j = 0; j < i; j++) {
       printf ("%d: %lf\n", j, array[j]); 
    }
    if (i == MAX_LEN)
       printf ("The file is huge, you should define larger array");
}


