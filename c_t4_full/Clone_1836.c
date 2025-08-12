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





int main(void) {
    FILE *file;
    int array[MAX];
    int i = 0;

    if((file=fopen("input.txt","r"))!=NULL){
        while((i<MAX)&&fscanf(file,"%d",(array+i))!=EOF)
            printf("%d ",*(array+i++));
        fclose(file);
    } else {
        printf("Unable to open file");
        return EXIT_FAILURE;
    }

    return EXIT_SUCCESS;
}


