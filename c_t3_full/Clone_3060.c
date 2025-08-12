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



 Multiple array items per line

int main () {
    double array[MAX_LEN];
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    while (!feof(fp) && i < MAX_LEN) {
        int ret = fscanf(fp, "%lf %lf %lf %lf %lf", &array[i], &array[i + 1], &array[i + 2], &array[i + 3], &array[i + 4]);
        i += ret;
        if (i == MAX_LEN) {
            printf("The file is too large, define larger array");
            break;
        }
    }
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, array[j++]);
    fclose(fp);
    return 0;
}


