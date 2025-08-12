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





#define MAX_NUMBERS  (MAX)

int main() {
    FILE *file = fopen("input.txt", "r");
    int numbers[MAX_NUMBERS], numCount=0;

    if (!file) {
        printf ("Unable to open file");
        return EXIT_FAILURE;
    }

    while (numCount < MAX_NUMBERS && fscanf(file, "%d", &numbers[numCount]) != EOF)
        printf ("%d ", numbers[numCount++]);
    
    fclose (file);

    return EXIT_SUCCESS;
}


