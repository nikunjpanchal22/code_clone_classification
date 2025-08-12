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



 Using getc to read char by char

int main () {
    double array[MAX_LEN];
    FILE *fp = fopen(FILE_NAME, "r");
    if (!fp) {
        perror("Cannot open the file");
        return 1;
    }
    int i = 0;
    char str[50];
    int j = 0;
    while((str[j] = fgetc(fp)) != EOF){
        if(str[j] == '\n'){
            str[j] = '\0';
            sscanf(str, "%lf", &array[i]);
            i++;
            j = 0;
        }else
            j++;
        if (i == MAX_LEN) {
            printf ("The file is too large, use larger array");
            break;
        }
    }
    j = 0;
    while (j < i)
        printf ("%d: %lf\n", j, array[j++]);
    fclose(fp);
    return 0;
}


