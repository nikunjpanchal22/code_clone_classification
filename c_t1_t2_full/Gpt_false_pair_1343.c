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
    char **arrayString;
    int position = 0;
    int instanceCount = 0;
    int errorCode;
    errorCode = isolate(str, ',', &arrayString, &instanceCount);
    if (errorCode) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", instanceCount);
    for (position = 0; position < instanceCount; position++) {
        printf ("str: %s\n", arrayString[position]);
    }
    free(arrayString);
    return 0;
}
