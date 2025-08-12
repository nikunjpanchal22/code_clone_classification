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
    FILE *f;
    int count = 0, max_size = 50;
    double *contents;

    if(!(f = fopen("filename", "r")))
        return -1;

    contents = (double*) malloc (max_size * sizeof(double));
    if (!contents) {
        fclose (f);
        return -1;
    }

    while(fscanf (f, "%lf", contents + count) == 1) {
        count += 1;

        if(count == max_size) {
            max_size *= 2;
            contents = realloc(contents, max_size * sizeof(double));

            if(!contents) {
                fclose (f);
                return -1;
            }
        }
    }

    free(contents);
    fclose(f);
    return 0;
}


