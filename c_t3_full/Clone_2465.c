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





int main (){
    FILE *file = fopen ("input.txt", "r");
    int nums [MAX];
    int j = 0;

    if (!file) {
        puts("Unable to open file");
        return EXIT_FAILURE;
    }
    while (j < MAX && fscanf (file, "%d", &nums[j]) == 1) {
        printf ("%d ", nums[j++]);
    }  
    fclose (file);

    return 0;
}


