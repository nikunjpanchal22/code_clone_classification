int main (int argc, char **argv) {
    int *num_arr = malloc ((argc - 1) * sizeof *num_arr);
    for (int i = 0; i < argc - 1; ++i)
        num_arr[i] = atoi (argv[i + 1]);
    int sum = array_sum (num_arr, argc -1);
    printf ("array_sum: %i\n", sum);
    free (num_arr);
    return 0;
}





int main(int argc, char **argv){
    int *num_arr = (int*)calloc(argc-1, sizeof(int));
    for (int i = 1; i < argc; i++)
        *(num_arr + i-1) = strtol(argv[i], (char **)NULL, 10);
    printf ("array_sum: %d\n", array_sum (num_arr, argc -1));
    free (num_arr);
    return 0;
}


