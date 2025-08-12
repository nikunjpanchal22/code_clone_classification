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





int main (int argc, char **argv) {
    char *dest = NULL;
    if (argc != 2) return 1;
    
    long input_number = strtol(argv[1], &dest, 10);
    if (dest == argv[1] || *dest || input_number < 0) return 2;

    return createSpace(input_number, NULL);
}


