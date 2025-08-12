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
    char **pieces;
    int pos = 0;
    int num = 0;
    int rc;
    rc = breakUp(str, ',', &pieces, &num);
    if (rc) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", num);
    for (pos = 0; pos < num; pos++) {
        printf ("str: %s\n", pieces[pos]);
    }
    free(pieces);
    return 0;
}
