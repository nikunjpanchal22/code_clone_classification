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
    FILE *f;
    size_t cnt = 0, cap = 32;
    double *data;

    if (!(f = fopen ("filename", "r")))
        return -1;
        
    data = (double*) calloc (cap, sizeof(double));

    if (!data) {
        fclose(f);
        return -1;
    }

    while (fscanf(f, "%lf", data + cnt) == 1) {
        cnt++;
        if (cnt == cap) {
            data = realloc(data, (cap *= 2) * sizeof(double));
            if (!data) {
                free(data);
                fclose(f);
                return -1;
            }
        }
    }

    free(data);
    fclose(f);
    return 0;
}


