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
    char *str = NULL;
    if (argc != 2) return 1;

    long val = strtol(argv[1], &str, 10);
    if (str == argv[1] || *str || val < 0) return 2;
    
    return allocateMemoryForVars(val, NULL);
}


