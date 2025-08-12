int main (int argc, char *argv []) {
    char md5 [MD5_LEN + 1];
    if (!CalcFileMD5 ("~/testfile", md5)) {
        puts ("Error occured!");
    }
    else {
        printf ("Success! MD5 sum is: %s\n", md5);
    }
}


 int main (int argc, char **argv) {
    char md5 [MD5_LEN + 1];
    if (!CalcFileMD5 ("~/testfile", md5)) {
        fprintf (stderr, "Error occured!\n");
        exit (EXIT_FAILURE);
    }
    printf ("Success! MD5 sum is %s\n", md5);
    exit (EXIT_SUCCESS);
}


