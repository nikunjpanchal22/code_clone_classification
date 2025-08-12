int main (int argc, char **argv) {
    int *num_arr = malloc ((argc - 1) * sizeof *num_arr);
    for (int i = 0; i < argc - 1; ++i)
        num_arr[i] = atoi (argv[i + 1]);
    int sum = array_sum (num_arr, argc -1);
    printf ("array_sum: %i\n", sum);
    free (num_arr);
    return 0;
}





int main(int argc, char** argv){
    int *num_arr = malloc((argc - 1) * sizeof(int));
    int i = 1;
    while(i < argc){
        num_arr[i-1] = strtol(argv[i++], NULL, 10);
    }
    printf("array_sum: %d\n", array_sum(num_arr, argc-1));
    free(num_arr);
    return 0;
}


