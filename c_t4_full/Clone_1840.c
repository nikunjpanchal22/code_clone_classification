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





#define MAX_ints (MAX)

int main(void) {
    FILE *fin = fopen("input.txt", "r");
    int ints[MAX_ints];
    int i = 0;

    if(fin == NULL) {
        puts("Unable to open file");
        return EXIT_FAILURE;
    }

    while (fscanf(fin, "%d", ints + i) == 1 && i < MAX_ints)
        printf("%d ", ints[i++]);
    fclose(fin);

    return EXIT_SUCCESS;
}


