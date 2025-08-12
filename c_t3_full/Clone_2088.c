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
    int result = EXIT_SUCCESS;
    int *array = NULL;
    if(array_allocate(&array) != -1) {
        ssize_t count = array_number_of_elements(array);
        if(count != -1) {
            printf("Number of array's elements is %zu.\n", (size_t)count);
        }
        else {
            result = EXIT_FAILURE;
            perror("array_number_of_elements() failed");
        }
    }
    else {
        result = EXIT_FAILURE;
        perror("array_allocate() failed");
    }
    free(array);
    return result;
}


