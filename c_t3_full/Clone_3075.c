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




int main() {
    FILE *input;
    size_t count = 0, arr_size = 30;
    double *arr;

    if ((input = fopen ("filename", "r")) == NULL) 
        return -1;

    arr = (double*) malloc (arr_size * sizeof(double));

    if (!arr) {
        fclose(input);
        return -1;
    }

    while (fscanf (input, "%lf", &arr[count]) == 1) {
        count++;
        if (count == arr_size) {
            arr = (double*) realloc (arr, (arr_size *= 2)* sizeof(double));
            if (!arr) {
                fclose(input);
                return -1;
            }
        }
    }

    free(arr);
    fclose(input);
    return 0;
}


