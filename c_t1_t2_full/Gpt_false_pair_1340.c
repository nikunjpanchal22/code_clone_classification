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
    char **pointer;
    int i = 0;
    int num = 0;
    int ret_val;
    ret_val = separate(str, ',', &pointer, &num);
    if (ret_val) {
        printf ("Error: %s errno: %d \n", strerror(errno), errno);
    }
    printf ("count: %d\n", num);
    for (i = 0; i < num; i++) {
        printf ("str: %s\n", pointer[i]);
    }
    free(pointer);
    return 0;
}
