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
    FILE *file;
    size_t ctr = 0, arr_size = 100;
    double *vals;

    if (!(file = fopen ("filename", "r"))) {
        return -1;
    }

    vals = (double*) malloc (arr_size * sizeof(double));

    if (!vals) {
        fclose(file);
        return -1;
    }

    while (fscanf(file, "%lf", &vals[ctr]) == 1) {
        ctr++;
        if (ctr == arr_size) {
            arr_size *= 2;
            vals = realloc (vals, arr_size * sizeof(double));
            if (!vals) {
                fclose(file);
                return -1;
            }
        }
    }

    free(vals);
    fclose(file);
    return 0;
}


