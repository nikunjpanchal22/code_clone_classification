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
    int arraySize = (sizeof (fieldDefinitions)/ sizeof (fieldDefinitions[0]));
    for (int index = arraySize - 1; index >= 0; index--) {
        demo *ptr = &fieldDefinitions[index];
        printf ("ptr: %p \n", (void *) ptr);
        printf ("ptr: %d \n", ptr -> a);
    }
    return 0;
}


