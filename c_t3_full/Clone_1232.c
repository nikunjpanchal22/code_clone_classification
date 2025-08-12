int main (int argc, char **argv) {
    if (argc != 2) {
        return 1;
    }
    char *err_pos = NULL;
    long n = strtol (argv[1], &err_pos, 10);
    if (err_pos == argv[1] || *err_pos || n < 0) {
        return 2;
    }
    return alloc_vars (n, NULL);
}


 int main(int argc, char **argv) {
    if (argc != 2) {
        printf("Incorrect number of arguments!\n");
        return 1;
    }
    char *err_pos = NULL;
    long n = strtol(argv[1], &err_pos, 10);
    if (err_pos != argv[1] || *err_pos || n < 0) {
        printf("Error: Invalid input\n");
        return 2;
    }
    return alloc_vars(n, NULL);
}


