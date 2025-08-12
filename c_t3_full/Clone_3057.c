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



 Using fgetpos and fsetpos

int main () {
    double array[MAX_LEN];
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    fpos_t position;
    while (fscanf(fp, "%lf", &array[i]) != EOF) {
        fgetpos(fp, &position);
        i++;
        if (i == MAX_LEN) {
            printf("The file is too large, define larger array");
            fsetpos(fp, &position);
            break;
        }
    }
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, array[j++]);
    fclose(fp);
    return 0;
}


