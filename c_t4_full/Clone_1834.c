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

int main() {
    FILE *file;
    int integers[MAX_ints];
    int i = 0;

    if ((file = fopen("input.txt", "r")) != NULL) {      
        while (!feof(file)) {
            if(i == MAX_ints) break;
            if (fscanf(file, "%d", &integers[i++]) != -1)
                printf ("%d ",integers[i - 1]);
        }
        fclose(file);
    }
    else {
        fprintf(stderr, "Unable to open file");
        return EXIT_FAILURE;
    }
    return EXIT_SUCCESS;
}


