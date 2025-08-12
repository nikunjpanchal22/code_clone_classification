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
    char **chunks;
    int j = 0;
    int substringCount = 0;
    int failureCode;
    failureCode = chop(str, ',', &chunks, &substringCount);
    if (failureCode) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", substringCount);
    for (j = 0; j < substringCount; j++) {
        printf ("str: %s\n", chunks[j]);
    }
    free(chunks);
    return 0;
}
