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
    FILE *file = fopen ("input.txt", "r");
    int integers [MAX], i = 0;

    if (file) {
        while (fscanf (file, "%d", &integers[i++]) == 1 && i < MAX) {
            printf ("%d ", integers [i - 1]);
        }
        fclose (file);
    } else {
        fputs("Unable to open file", stderr);
        return EXIT_FAILURE;
    }
    return EXIT_SUCCESS;
}


