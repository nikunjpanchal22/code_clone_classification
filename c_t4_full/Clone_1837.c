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





#define SIZE (MAX)

int main() {
    FILE *file; 
    int integers[SIZE];
    int i = 0;

    file = fopen("input.txt", "r");

    if (!file) {
        printf("Unable to open file");
        return EXIT_FAILURE;
    }

    while (!feof(file) && fscanf(file, "%d", integers + i) == 1 && i++ < SIZE)
        printf("%d ", integers[i - 1]);

    fclose(file);
    return EXIT_SUCCESS;
}


