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
    int *array_pointer = NULL;
    int return_value = EXIT_SUCCESS;
    if (array_allocate(&array_pointer) == -1) {
        perror("array_allocate() failed");
        return_value = EXIT_FAILURE;
    }
    else {
        ssize_t element_count = array_number_of_elements(array_pointer);
        if(element_count == -1) {
            perror("array_number_of_elements() failed");
            return_value = EXIT_FAILURE;
        }
        else {
            printf("Number of elements in array is %zu.\n", (size_t)element_count);
        }
    }
    free(array_pointer);
    return return_value;
}


