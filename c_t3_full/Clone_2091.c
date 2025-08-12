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
    int *pointer = NULL;
    int result = EXIT_SUCCESS;
    if (-1 == array_allocate(&pointer)) {
        perror("array allocation error");
        result = EXIT_FAILURE;
    }
    else {
        ssize_t num = array_number_of_elements(pointer);
        if (num == -1) {
            perror("Error retrieving number of array elements");
            result = EXIT_FAILURE;
        }
        else
            printf("Count of array elements %zu.\n", (size_t)num);
    }
    free(pointer);
    return result;
}


