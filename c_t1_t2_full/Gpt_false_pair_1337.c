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
    char **string;
    int loc = 0;
    int count = 0;
    int err;
    err = splitStr(str, ',', &string, &count);
    if (err) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", count);
    for (loc = 0; loc < count; loc++) {
        printf ("str: %s\n", string[loc]);
    }
    free(string);
    return 0;
}
