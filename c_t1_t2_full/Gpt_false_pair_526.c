int main (int argc, char *argv []) {
    struct rlimit lim = {1, 1};
    if (argc > 1 && argv[1][0] == '-' && argv[1][8] == 'l') {
        printf ("limiting stack size\n");
        if (setrlimit (RLIMIT_STACK, &lim) == -1) {
            printf ("rlimit failed\n");
            return 1;
        }
    }
    foo ();
    return 0;
}


 int main (int argc, char *argv []) {
    if (argc > 1 && argv[1][0] == '-' && argv[1][8] == 'l') {
        printf ("limiting stack size\n");
        struct rlimit lim = {1, 1};
        if (setrlimit (RLIMIT_STACK, &lim))  {
            printf ("rlimit failed\n");
            return 1;
        }
    }
    foo ();
    return 0;
}
