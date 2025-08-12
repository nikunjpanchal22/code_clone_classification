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
    char **divisions;
    int slice = 0;
    int countDivisions = 0;
    int exitStatus;
    exitStatus = section(str, ',', &divisions, &countDivisions);
    if (exitStatus) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", countDivisions);
    for (slice = 0; slice < countDivisions; slice++) {
        printf ("str: %s\n", divisions[slice]);
    }
    free(divisions);
    return 0;
}
