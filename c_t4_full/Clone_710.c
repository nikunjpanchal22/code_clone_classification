int main (int argc, char *argv []) {
    FILE *fp;
    char filename [100];
    char line [MAX_LINE_LEN];
    char *p;
    int array [MAX_NUM];
    int index, count, max;
    printf ("Please enter the file name: \n");
    if (scanf ("%99s", filename) != 1) {
        fatal ("Error in entering file.");
    }
    if ((fp = fopen (filename, "r")) == NULL) {
        fatal ("Unable to open the file.");
    }
    while ((p = fgets (line, MAX_LINE_LEN, fp)) != NULL) {
        p += strspn (p, " \t\n");
        if (*p == '#' || *p == '\0') {
            continue;
        }
        for (count = 0; *p != '\0';) {
            if (isdigit ((unsigned char) *p)) {
                array[count++] = strtol (p, &p, 10);
                printf ("%d\n", array [count]);
            }
            else {
                p += strcspn (p, " \t\n");
            }
            p += strspn (p, " \t\n");
        }
        index = get_max_occurrence_index (array, count);
        max = get_number_of_occurrences (array, count, array[index]);
        printf ("The element that occurs most often is %d\n", array [index]);
        printf ("And it has occurred %d times\n", max);
    }
    fclose (fp);
    return 0;
}


 
int main (int argc, char *argv[]) {
    char fileName[100]; 
    int arr[MAX_NUM], i, index, count, max;
    FILE *fp;
 
    printf("Please enter the file name: \n");
    if (scanf("%99s", fileName) != 1) {
        fatal("Error in entering file.");
    }
    if ((fp = fopen(fileName, "r")) == NULL) {
        fatal("Unable to open the file.");
    }
    while (fgets (fileName, MAX_LINE_LEN, fp) != NULL) {
        if (fileName[0] != '#' && !isspace(fileName[0])) {
            for (i = 0; i < strlen (fileName); i++) {
                if (isdigit(fileName[i])) {
                    arr[count] = fileName[i] - '0';
                    printf ("%d\n", arr[count]);
                    count++;
                }
            }
        }
    }
    index = get_max_occurrence_index (arr, count);
    max = get_number_of_occurrences (arr, count, arr[index]);
    printf ("The element that occurs most often is %d\n", arr[index]);
    printf ("And it has occurred %d time\n", max);
    fclose (fp); 
    return 0;
}


