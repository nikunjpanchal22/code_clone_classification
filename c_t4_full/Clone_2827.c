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
    demo *ptr;
    for (ptr = fieldDefinitions; ptr<fieldDefinitions+(sizeof(fieldDefinitions)/sizeof(fieldDefinitions[0])); ptr++){
        printf("ptr: %p\n", (void*) ptr);
        printf("ptr: %d \n", ptr -> a);
    }
    return 0;
}


