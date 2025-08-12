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
    char *b = "0111"; 
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0;
    for(int i = 0; b[i] != '\0'; i++) 
    {
        if (b[i] == '1')
            result += pow(2, (strlen(b) - i - 1));
    }

    printf("%d\n", result);
    return 0;
}


