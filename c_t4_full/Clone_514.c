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
    char *b = "1101";
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0;
    int i=0;
    while (b[i] != '\0')
    { 
        if (b[i] == '1')
            result += (1 << (strlen(b) - 1 - i)); 
        i++;
    } 

    printf("%d\n", result); 
    return 0;
}


