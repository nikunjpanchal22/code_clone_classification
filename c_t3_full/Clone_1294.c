int main (int argc, char **argv) {
    FILE *file;
    char line [100];
    file = fopen ("numbers.txt", "r");
    if (file == NULL)
        return -1;
    while (fgets (line, sizeof (line), file) != NULL) {
        char *start;
        int array [100];
        int count;
        int value;
        int step;
        count = 0;
        start = line;
        while (sscanf (start, "%d%n", array +count, &step) == 1) {
            start += step;
            count += 1;
        }
        fprintf (stderr, "%d ", array [0]);
        value = 1;
        for (int i = 1; i < count; ++i) {
            value += (array[i] - array[i - 1]) ? 1 : 0;
            fprintf (stderr, "%d ", array [i]);
        }
        fprintf (stderr, " -- %d\n", value);
    }
    fclose (file);
    return 0;
}


 int main (int argc, char **argv) {
    FILE *file;
    char line[100];
    int array[100];
    int count;
    int step;
    int value;
    file = fopen("numbers.txt", "r");
    if (file == NULL) {
        return -1;
    }
    while (fgets(line, sizeof(line), file) != NULL) {
        char *start = line;
        count = 0;
        while (sscanf(start, "%d%n", array + count, &step) == 1) {
            start += step;
            count++;
        }
        printf("%d ", array[0]);
        value = 1;
        for(int i = 1; i < count; ++i) {
            if (array[i] - array[i - 1] != 0) {
                value += 1;
            }
            printf("%d ", array[i]);
        }
        printf("-- %d\n", value);
    }
    fclose(file);
    return 0;
}


