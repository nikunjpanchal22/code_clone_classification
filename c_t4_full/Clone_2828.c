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


 
pp
int main() {
    for (demo* ptr = fieldDefinitions, *end = fieldDefinitions + sizeof(fieldDefinitions) / sizeof(demo) - 1; ptr <= end; ++ptr) {
        printf ("ptr: %p \n", (void *) ptr);
        printf ("ptr: %d \n", ptr -> a);
    }
    return 0;
}


