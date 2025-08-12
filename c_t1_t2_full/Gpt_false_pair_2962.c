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
                array[count++] = atoi (p);
                printf("%d\n", array[count]);
            }
            else {
                p += strcspn (p, " \t\n");
            }
            p += strspn (p, " \t\n");
        }
        index = find_max_occurrence_index (array, count);
        max = count_number_of_occurrences (array, count, array[index]);
        printf ("The element that occurs most often is %d\n", array [index]);
        printf ("And it has been seen %d times\n", max);
    }
    fclose (fp);
    return 0;
}
