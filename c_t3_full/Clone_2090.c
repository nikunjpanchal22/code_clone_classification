int main (void) {
    int result = EXIT_SUCCESS;
    int *pi = NULL;
    if (-1 == array_allocate (&pi)) {
        result = EXIT_FAILURE;
        perror ("array_allocate() failed");
    }
    else {
        ssize_t result_number_of_elements = array_number_of_elements (pi);
        if (-1 == result_number_of_elements) {
            result = EXIT_FAILURE;
            perror ("array_number_of_elements() failed");
        }
        else {
            size_t number_of_elements = result_number_of_elements;
            printf ("The number of array's elements is %zu.\n", number_of_elements);
        }
    }
    free (pi);
    return result;
}




int main (void) {
    int *array = NULL;
    int exit_status = EXIT_SUCCESS;
    if (-1 == array_allocate(&array)) {
        perror("Failed array allocation");
        exit_status = EXIT_FAILURE;
    }
    else {
        ssize_t num_elements = array_number_of_elements(array);
        if (num_elements == -1) {
            perror("Failed to get array element count");
            exit_status = EXIT_FAILURE;
        }
        else {
            printf ("Array contains %zu elements.\n", (size_t)num_elements);
        }
    }
    free(array);
    return exit_status;
}


