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
    char *b = "1100";
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0; 
    for (int i = 0; i < strlen(b); i++) 
        result += (b[i] - '0') << (strlen(b) - 1 - i);

    printf("%d\n", result);
    return 0;
}


