int main (void) {
    {
        char *tmp;
        char *b = "0101";
        printf ("%d\n", strtol (b, & tmp, 2));
    }
    {
        printf ("%s\n", byte_to_binary (5));
    }
    return 0;
}


 int main (void) {
    char *tmp;
    char *b = "1111";
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0;
    int power = 1;
    while (*b)
    {
        result += ((*b++) - '0') * power;
        power <<= 1;
    }

    printf("%d\n", result);
    return 0;
}


