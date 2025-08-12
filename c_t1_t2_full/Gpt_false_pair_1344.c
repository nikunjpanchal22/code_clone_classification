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
    char *strArr[100];
    int k = 0;
    int size = 0;
    int status;
    status = tokenize(str, ',', strArr, &size);
    if (status) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", size);
    for (k = 0; k < size; k++) {
        printf ("str: %s\n", strArr[k]);
    }
    free(strArr);
    return 0;
}
