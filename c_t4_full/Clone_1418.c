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





int main(int argc, char *argv[])
{
    struct rlimit lim = {1, 1};
    if (!(argc > 1 && argv[1][0] == '-' && argv[1][8] == 'l') || setrlimit(RLIMIT_STACK, &lim) != -1) {
        foo();
        return 0;
    }
    
    printf("limiting stack size\nrlimit failed\n");
    return 1;
}


