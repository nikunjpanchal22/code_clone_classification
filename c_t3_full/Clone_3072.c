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
    FILE *srcFile;
    size_t i_val = 0, arr_size = 8;
    double *dArr;

    if (!(srcFile = fopen ("filename", "r"))) 
        return -1;

    dArr = (double*) malloc (arr_size * sizeof(double));
    if (!dArr) {
        fclose(srcFile);
        return -1;
    }

    while (fscanf(srcFile, "%lf", dArr + i_val) == 1) {
        i_val++;
        if (i_val == arr_size) {
            dArr = realloc(dArr, (arr_size *= 2) * sizeof(double));
            if (!dArr) { 
                fclose(srcFile);
                return -1;
            }
        }
    }

    free(dArr);
    fclose (srcFile);
    return 0;
}


