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
    unsigned char md5 [MD5_LEN + 1];
    if (!CalcFileMD5 ("~/testfile", md5)) {
        puts ("Error occured!");
        return EXIT_FAILURE;
    }
    printf ("Success! MD5 sum is %s\n", md5);
    return EXIT_SUCCESS;
}


