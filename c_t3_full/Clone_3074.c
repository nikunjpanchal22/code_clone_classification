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
    FILE *file;
    size_t indx = 0, size = 64;
    double *ptr;

    if (!(file = fopen("filename", "r"))) 
        return -1;
    ptr = (double*) calloc(size, sizeof(double));

    if (!ptr) {
        fclose(file);
        return -1;
    }

    while (fscanf(file, "%lf", &ptr[indx]) == 1) {
        if (++indx == size) 
            ptr = (double*) realloc(ptr, (size *= 2) * sizeof(double));
        if (!ptr) {
            free(ptr);
            fclose(file);
            return -1;
        }
    }

    free(ptr);
    fclose(file);
    return 0;
}


