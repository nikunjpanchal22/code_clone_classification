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
    FILE *src;
    size_t cnt = 0, array_len = 10;
    double *values;

    if (!(src = fopen("filename", "r"))) 
        return -1;

    values = malloc(array_len * sizeof(double));
    if (!values) {
        fclose(src);
        return -1;
    }

    while(fscanf(src, "%lf", &values[cnt]) == 1) {
        cnt++;
        if(cnt == array_len) {
            array_len*=2;
            values = realloc(values, array_len * sizeof(double));
            if (!values) {
                fclose(src);
                return -1;
            }
        }
    }

    free(values);
    fclose(src);
    return 0;
}


