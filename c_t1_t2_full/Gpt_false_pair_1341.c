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
    char **strings;
    int index = 0;
    int runCount = 0;
    int errCode;
    errCode = chunk(str, ',', &strings, &runCount);
    if (errCode) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", runCount);
    for (index = 0; index < runCount; index++) {
        printf ("str: %s\n", strings[index]);
    }
    free(strings);
    return 0;
}
