int main (void) {
    FILE *in;
    size_t count = 0;
    size_t array_size = 16;
    double *array;
    in = fopen ("filename", "r");
    if (!in)
        return -1;
    array = malloc (array_size * sizeof (*array));
    if (!array) {
        fclose (in);
        return -1;
    }
    while (fscanf (in, "%lf", array +count) == 1) {
        count += 1;
        if (count == array_size) {
            double *temp;
            array_size *= 2;
            temp = realloc (array, array_size);
            if (!temp) {
                free (array);
                fclose (in);
                return -1;
            }
            array = temp;
        }
    }
    free (array);
    fclose (in);
    return 0;
}



int main (void) {
    FILE *in;
    size_t i = 0, max = 10;
    double *arr;
    in = fopen("filename", "r");
    if(in == NULL)
        return -1;
    arr = malloc(max * sizeof(double));
    if(arr == NULL){
        fclose(in);
        return -1;
    }
    while(fscanf(in, "%lf", arr+i) == 1){
        if(++i == max){
            max *= 2;
            arr = realloc(arr, max*sizeof(double));
            if(arr == NULL){
                free(arr);
                fclose(in);
                return -1;
            }
        }
    }
    free(arr);
    fclose(in);
    return 0;
}


