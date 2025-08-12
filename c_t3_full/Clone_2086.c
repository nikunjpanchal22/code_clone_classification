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




int main(void) {
    int *p = NULL;
    int result = EXIT_SUCCESS;
    if (array_allocate (&p) == -1) {
        perror ("array_allocate() failure");
        result = EXIT_FAILURE;
    } else {
        ssize_t elements = array_number_of_elements (p);
        if (elements == -1) {
            perror ("array_number_of_elements() failure");
            result = EXIT_FAILURE;
        } else {
            printf ("The array contains %zu elements.\n", (size_t)elements);
        }
    }
    free(p);
    return result;
}


