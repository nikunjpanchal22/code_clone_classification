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





int main() {
    FILE *file;
    int arrNbrs[MAX];
    int cnt = 0;
    if ((file = fopen("input.txt", "r")) == NULL) {
        printf("Unable to open file");
        return EXIT_FAILURE;
    }
    while (!feof(file) && cnt < MAX) {
        fscanf(file, "%d", arrNbrs + cnt);
        printf("%d ", arrNbrs[cnt++]);
    }
    fclose(file);
    return EXIT_SUCCESS;
}


