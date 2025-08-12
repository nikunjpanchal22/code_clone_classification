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
    char *b = "0001";
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0;
    for (int i = 0; i < strlen(b); i++) 
        result = result * 2 + (b[i] - '0'); 

    printf("%d\n", result); 
    return 0;
}


