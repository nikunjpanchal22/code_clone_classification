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
    char **span;
    int index = 0;
    int total = 0;
    int res;
    res = dissect(str, ',', &span, &total);
    if (res) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", total);
    for (index = 0; index < total; index++) {
        printf ("str: %s\n", span[index]);
    }
    free(span);
    return 0;
}
