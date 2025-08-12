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
    demo *ptr = fieldDefinitions;
    demo *end = &fieldDefinitions[(sizeof(fieldDefinitions) / sizeof(demo)) - 1];
    while (ptr <= end) {
        printf("ptr: %p \n", ptr);
        printf("ptr: %d \n", ptr -> a);
        ptr++;
    }
    return 0;
}


