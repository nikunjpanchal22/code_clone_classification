int main (void) {
    int n;
    int divisor;
    int answer = 0;
    int current_buffer_size = INITIAL_BUFFER_SIZE;
    char *line = malloc (current_buffer_size);
    if (line == NULL) {
        return EXIT_FAILURE;
    }
    setvbuf (stdin, (char *) NULL, _IOFBF, 0);
    scanf ("%d%d\n", & n, & divisor);
    while (n > 0) {
        unsigned long dividend;
        char *endp;
        int offset = 0;
        while (fgets (line +offset, current_buffer_size, stdin)) {
            if (line[strlen (line) - 1] == '\n') {
                break;
            }
            else {
                int new_buffer_size = 2 * current_buffer_size;
                char *tmp = realloc (line, new_buffer_size);
                if (tmp) {
                    line = tmp;
                    offset = current_buffer_size - 1;
                    current_buffer_size = new_buffer_size;
                }
                else {
                    break;
                }
            }
        }
        errno = 0;
        dividend = strtoul (line, &endp, 10);
        if (!((endp == line) || errno)) {
            if (dividend % divisor == 0) {
                answer += 1;
            }
        }
        n -= 1;
    }
    printf ("%d\n", answer);
    return 0;
}



 

#define INITIAL_BUFFER_SIZE 1024
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>
int main (void) {
	    int n; int divisor; int answer = 0; int current_buffer_size = INITIAL_BUFFER_SIZE;
	    char *line = malloc (current_buffer_size); 
	    if (line == NULL) { return EXIT_FAILURE; }
	    setvbuf (stdin, (char *) NULL, _IOFBF, 0);
	    scanf ("%d%d\n", &n, &divisor); 
	    while (n > 0) { unsigned long dividend; char *endp; int offset = 0;
		while (fgets (line +offset, current_buffer_size, stdin)) {
		    if (line[strlen (line) - 1] == '\n') { break; } 
		    else { 
		        int new_buffer_size = 2 * current_buffer_size; 
		        char *tmp = realloc (line, new_buffer_size); 
		        if (tmp) { line = tmp; offset = current_buffer_size - 1; current_buffer_size = new_buffer_size; } 
		        else { break; } }
		} 
		errno = 0; dividend = strtoul (line, &endp, 10);
		if (!((endp == line) || errno)) { 
		    if (dividend % divisor == 0) { answer += 1; }
		} 
		n -= 1; }
	    printf ("%d\n", answer);
	    free(line);
	    return 0;}

 

#define INITIAL_BUFFER_SIZE 2048
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>
int main (void) {
	    int n; int x; int answer = 0; int current_buffer_size = INITIAL_BUFFER_SIZE;
	    char *line = malloc (current_buffer_size); 
	    if (line == NULL) { return EXIT_FAILURE; }
	    scanf ("%d%d\n", &n, &x); 
	    while (n--) { 
		if (fgets(line, current_buffer_size, stdin) == NULL) { break; } 
		char *endp;
		unsigned long dividend = strtoul (line, &endp, 10);
		if (!((endp == line) || errno)) { if (dividend % x == 0) { answer++; } } 
	    }
	    printf ("%d\n", answer);
	    free(line);
	    return 0;}



#define INITIAL_BUFFER_SIZE 1024
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>
int main (void) {
	    int n, divisor, answer = 0, current_buffer_size = INITIAL_BUFFER_SIZE;
	    char* line = (char *) malloc(current_buffer_size*sizeof(char));
	    if(line == NULL) { return 1; }
	    scanf("%d%d", &n, &divisor);
	    fgetc(stdin);
	    while(n--) {
		fgets(line,current_buffer_size,stdin);
		unsigned long long int dividend = strtoull(line,NULL,10);
		if(dividend%divisor == 0) { answer++; }
	    }
	    printf("%d\n", answer);
	    free(line);
	    return 0;
}


