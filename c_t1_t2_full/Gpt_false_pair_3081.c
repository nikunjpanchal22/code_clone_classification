int main (void) {
    char *inputString = "1-2,4^,14-56";
    char *next_code_at = inputString;
    long result;
    char dest [100], *dest_ptr;
    printf ("%s\n", inputString);
    dest[0] = 0;
    dest_ptr = dest;
    while (next_code_at && *next_code_at) {
        while (*next_code_at && !(isdigit (*next_code_at))) {
            dest_ptr += sprintf (dest_ptr, "%c", *next_code_at);
            next_code_at++;
        }
        if (*next_code_at) {
            result = strtol (next_code_at, &next_code_at, 10);
            if (errno) {
                perror ("strtol failed");
                return EXIT_FAILURE;
            }
            else {
                if (result < LONG_MAX)
                    dest_ptr += sprintf (dest_ptr, "%ld", result +1);
                else {
                    fprintf (stderr, "number too large!\n");
                    return EXIT_FAILURE;
                }
            }
        }
    }
    printf ("%s\n", dest);
    return EXIT_SUCCESS;
}


int main(void) 
{ 
    char *inputString = "1-2,4^,14-56"; 
    char *next_code_at = inputString; 
    long result; 
    char dest [100], *dest_ptr; 
    printf ("%s\n", inputString); 
    dest[0] = 0; 
    dest_ptr = dest; 
    while (next_code_at && *next_code_at) 
    { 
        while (*next_code_at && !isdigit (*next_code_at)) 
        { 
            dest_ptr += sprintf(dest_ptr,"%c", *next_code_at); 
            next_code_at++; 
        } 
        if (*next_code_at) 
        { 
            result = strtol(next_code_at, &next_code_at, 10); 
            if (errno) 
            { 
                perror("strtol failed"); 
                return EXIT_FAILURE; 
            } 
            else 
            { 
                if (result < LONG_MAX) 
                    dest_ptr += snprintf(dest_ptr, 10, "%ld", result + 1); 
                else 
                { 
                    fprintf(stderr, "number too large!\n"); 
                    return EXIT_FAILURE; 
                } 
            } 
        } 
    } 
    printf("%s\n", dest); 
    return EXIT_SUCCESS; 
}  
