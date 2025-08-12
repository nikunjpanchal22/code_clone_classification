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
    double array[MAX_LEN];
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    char buff[255];
    int i = 0;
    while(fgets(buff, 255, fp) && i < MAX_LEN) {
        sscanf(buff, "%lf", &array[i]);
        i++;
    }
    if(i == MAX_LEN)
        printf("The file is huge, you must define larger array");
    int j = 0;
    while (j < i)
        printf("%d: %lf\n", j, array[j++]);
    fclose(fp);
    return 0;    
}


