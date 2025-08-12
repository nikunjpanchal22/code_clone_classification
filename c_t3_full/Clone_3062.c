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



 With structure to hold array of doubles

typedef struct {
    double array[MAX_LEN];
} ArrayWrapper;

int main () {
    ArrayWrapper aw;
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    while (fscanf(fp, "%lf", &aw.array[i]) != EOF) {
        i++;
        if (i == MAX_LEN) {
            printf("The file is too large, use larger array");
            break;
        }
    }
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, aw.array[j++]);
    fclose(fp);
    return 0;
}


