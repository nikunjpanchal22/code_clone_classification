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
    FILE *inFile;
    size_t idx = 0, arrSize = 15;
    double *arr;

    if ((inFile = fopen("filename", "r")) == NULL) return -1;

    arr = calloc(arrSize, sizeof(double));

    if (!arr) {
        fclose(inFile);
        return -1;
    }

    while (fscanf(inFile, "%lf", &arr[idx]) == 1) {
        if (++idx == arrSize) {
            arrSize *= 2;
            arr = realloc(arr,arrSize*sizeof(double));

            if (!arr) {
                fclose(inFile);
                return -1;
            }
        }
    }

    free(arr);
    fclose(inFile);
    return 0;
}


