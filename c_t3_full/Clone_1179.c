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
    char *b = "0110";
    printf ("%d\n", strtol (b, & tmp, 2));
    
    int result = 0;
    for (int i = strlen(b) - 1; i >= 0; i--)
        result = result * 2 + (b[i] - '0'); 

    printf("%d\n", result); 
    return 0;
}


