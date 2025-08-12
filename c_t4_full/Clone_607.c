int main (void) {
    demo *ptr = fieldDefinitions;
    demo *end = &fieldDefinitions[sizeof (fieldDefinitions) / sizeof (fieldDefinitions[0]) - 1];
    do {
        printf ("ptr: %p \n", (void *) ptr);
        printf ("ptr: %d \n", ptr -> a);
    }
    while (ptr++ < end);
    return 0;
}


 int main (int argc, char** argv) {
    demo *ptr = fieldDefinitions;
    int arraySize = (sizeof (fieldDefinitions) / sizeof (fieldDefinitions[0]));
    int position = 0;
    while (position < arraySize) {
        printf ("ptr: %p \n", (void *) ptr);
        printf ("ptr: %d \n", ptr -> a);
        position++;
        ptr++;
    }
    return 0;
}


