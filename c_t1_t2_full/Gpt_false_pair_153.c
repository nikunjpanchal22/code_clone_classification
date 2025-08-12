int main (void) {
    char string [100];
    char *tptr;
    size_t i, len;
    printf ("\nEnter string: ");
    if (fgets (string, sizeof (string), stdin) == NULL)
        return 1;
    tptr = strtok (string, " \n\r\t");
    while (tptr != NULL) {
        tptr[0] = toupper (tptr[0]);
        len = strlen (tptr);
        for (i = 0; i < len; i++)
            printf ("%c", tptr[len - 1 - i]);
        tptr = strtok (NULL, " \n\r\t");
        if (tptr != NULL)
            printf (" ");
    }
    printf ("\n");
    return 0;
}


 int main() 
{ 
    char line[100]; 
    char *ptr; 
    size_t index, length; 
    printf("\nInput string: ");
    if(fgets(line, sizeof(line), stdin) == NULL) 
        return 1;
    ptr = strtok(line, " \n\r\t"); 
    while (ptr != NULL) 
    { 
        ptr[0] = toupper(ptr[0]);
        length = strlen(ptr);
        for (index = 0; index < length; index++)
            printf("%c", ptr[length - 1 - index]);
        ptr = strtok(NULL, " \n\r\t");
        if (ptr != NULL)
            printf(" ");
    }
    printf("\n");
    return 0;
}
