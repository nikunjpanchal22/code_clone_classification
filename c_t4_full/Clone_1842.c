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





main() {
    int integers[MAX], i=0;
    FILE *file;

    if(!(file = fopen("input.txt", "r"))) {
        perror("Unable to open file");
        exit(EXIT_FAILURE);
    }

    while(!feof(file) && i < MAX && fscanf(file, "%d", &integers[i]) == 1)
        printf ("%d ", integers[i++]);
    
    fclose(file);
    return EXIT_SUCCESS;
}


