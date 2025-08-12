int main () {
    FILE *file = fopen ("input.txt", "r");
    int integers [MAX];
    int i = 0;
    if (file != NULL) {
        while (!feof (file) && i < MAX) {
            if (fscanf (file, "%d", &integers[i++]) != -1) {
                printf ("%d ", integers [i - 1]);
            }
        }
        fclose (file);
    }
    else {
        printf ("Unable to open file");
        return EXIT_FAILURE;
    }
    return 0;
}





int main () {
    FILE *file = fopen("input.txt", "r");

    if (file == NULL) {
        printf ("Unable to open file");
        return EXIT_FAILURE;
    }

    int integers[MAX];
    int i = 0;
    while (!feof(file) && fscanf(file,"%d",&integers[i])!=EOF && i < MAX)
        printf ("%d ",integers[i++]);

    fclose(file);
    return EXIT_SUCCESS;
}


