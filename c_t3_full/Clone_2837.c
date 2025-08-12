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
    if (argc != 2) return 1;
    
    char *endPtr;
    long my_value = strtol(argv[1], &endPtr, 10);
    if (endPtr == argv[1] || *endPtr || my_value < 0) return 2;
    
    return variableAlloc(my_value, NULL);
}


