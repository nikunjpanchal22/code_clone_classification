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
    int *data = NULL;
    int return_code = EXIT_SUCCESS;
    if(-1 == array_allocate (&data)) {
        perror ("array allocation error");
        return_code = EXIT_FAILURE;
    } else {
        ssize_t no_of_elements = array_number_of_elements (data);
        if (-1 == no_of_elements) {
            perror ("Error occurred while counting array elements");
            return_code = EXIT_FAILURE;
        } else {
            printf ("Array contains %zu items.\n", (size_t)no_of_elements);
        }
    }
    free (data);
    return return_code;
}


