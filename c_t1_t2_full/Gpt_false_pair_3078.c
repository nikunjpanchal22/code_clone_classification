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
    char** res;
    int i;
    int count;
    int result;
    result = split (str, ',', &res, &count);
    if (result) {
        printf ("Error: %s errno: %d \n", strerror (errno), errno);
    }
    printf ("count: %d\n", count);
    for (i = 0; i < count; i++) {
        printf ("str: %s\n", res[i]);
    }
    free(res);
    return 0;
}
