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




int main () {
    FILE *fp;
    size_t i = 0, arr_len = 32;
    double *arr;

    if ((fp = fopen("filename", "r")) == NULL) return -1;

    arr = malloc(arr_len * sizeof(double));
    if (!arr) {
        fclose(fp);
        return -1;
    }

    while (fscanf (fp, "%lf", &arr[i]) == 1) {
        if (++i == arr_len) {
            arr_len *= 2;
            arr = realloc(arr, arr_len * sizeof(double));
            if (!arr) {
                fclose(fp);
                return -1;
            }
        }
    }

    free(arr);
    fclose(fp);
    return 0;
}


