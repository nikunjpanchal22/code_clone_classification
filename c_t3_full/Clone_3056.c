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



 Using getline instead of fscanf

#define MAX_LINE_LENGTH 1024
int main () {
    double array[MAX_LEN];
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    char* line = NULL;
    size_t len = 0;
    while ((getline(&line, &len, fp)) != -1) {
        array[i] = strtod(line, NULL);
        i++;
        if (i == MAX_LEN) {
            printf("The file is too large, use larger array");
            break;
        }
    }
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, array[j++]);
    fclose(fp);
    free(line);
    return 0;
}


