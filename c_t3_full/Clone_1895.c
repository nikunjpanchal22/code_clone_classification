int main (void) {
    char string1 [] = "something";
    int start = 2, count = 3;
    char string2 [10] = {0};
    char *ptr1 = &string1[start];
    char *stop = ptr1 + count;
    char *ptr2 = string2;
    while ((ptr1 < stop) && (*ptr2++ = *ptr1++))
        ;
    printf ("%s", string2);
    return 0;
}


 int main(void) {
    char string1[] = "something";
    int start = 2, length = 3;
    char *ptr1 = &string1[start];
    char *stop = ptr1 + length;
    char *ptr2;
    char string2[10] = {0};
    for(ptr2 = string2; ptr1 < stop; ptr2++, ptr1++)
        *ptr2 = *ptr1;
    printf("%s", string2);
    return 0;
}


