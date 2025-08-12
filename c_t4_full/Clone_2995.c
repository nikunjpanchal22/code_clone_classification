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



 Using a dynamic array

#define INIT_SIZE 10
int main () {
    double *array = malloc(INIT_SIZE * sizeof(double));
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    int size = INIT_SIZE;
    while (fscanf(fp, "%lf", &array[i]) != EOF) {
        i++;
        if(i >= size){
            size *= 2;
            array = realloc(array, size * sizeof(double));
        }
    }
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, array[j++]);
    fclose(fp);
    free(array);
    return 0;
}


