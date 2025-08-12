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



 

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <errno.h>
#include <limits.h>

int main () {
    char *inputString = "5-8,10^,20-68", *next_code_at = inputString;
    long val;
    char store[100], *store_ptr;
    printf ("%s\n", inputString);
    store[0] = 0;
    store_ptr = store;
    	
    while (*next_code_at) {
        while (!isdigit(*next_code_at) && *next_code_at)
            store_ptr += sprintf(store_ptr, "%c", *next_code_at++);
            
        if (next_code_at) {
            val = strtol (next_code_at, &next_code_at, 10);
            if (errno) {
                perror ("strtol failed");
                return EXIT_FAILURE;
            }
            else {
                if (val < LONG_MAX)
                    store_ptr += sprintf(store_ptr, "%ld", val +1);
                else {
                    fprintf(stderr, "number too large!\n");
                    return EXIT_FAILURE;
                }
            }
        }
    }
    printf ("%s\n", store);
    return EXIT_SUCCESS;
}


