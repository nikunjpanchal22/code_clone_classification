int main () {
    char **res;
    int k = 0;
    int count = 0;
    int rc;
    rc = split (str, ',', &res, &count);
    if (rc) {
        printf ("Error: %s errno: %d \n", strerror (errno), errno);
    }
    printf ("count: %d\n", count);
    for (k = 0; k < count; k++) {
        printf ("str: %s\n", res [k]);
    }
    free (res);
    return 0;
}


 
int main() {
    char **array;
    int k = 0;
    int length = 0;
    int error;
    error = segment(str, ',', &array, &length);
    if (error) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", length);
    for (k = 0; k < length; k++) {
        printf ("str: %s\n", array[k]);
    }
    free(array);
    return 0;
}
