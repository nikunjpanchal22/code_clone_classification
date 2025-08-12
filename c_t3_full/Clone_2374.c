int main (void) {
    char buffer [10];
    char *input = 0;
    size_t cur_len = 0;
    size_t cur_max = 0;
    while (fgets (buffer, sizeof (buffer), stdin) != 0) {
        size_t buf_len = strlen (buffer);
        if (cur_len + buf_len + 1 > cur_max) {
            size_t new_len = cur_max * 2 + 1;
            if (buf_len + 1 > new_len)
                new_len = buf_len + 1;
            char *extra = realloc (input, new_len);
            if (extra == 0)
                break;
            input = extra;
            cur_max = new_len;
        }
        strcpy (input + cur_len, buffer);
        cur_len += buf_len;
    }
    printf ("%s [%d]", input, (int) strlen (input));
    free (input);
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	    char buffer[10];
	    char* input = NULL;
	    int cur_len = 0;
	    int cur_max = 0;
	    while (fgets(buffer, sizeof(buffer), stdin)) {
		int buf_len = strlen(buffer);
		if (cur_len + buf_len + 1 > cur_max) {
		    cur_max = (cur_max * 2) + 1;
		    if (buf_len + 1 > cur_max)
		        cur_max = buf_len + 1;
		    char* tmp = realloc(input, cur_max);
		    if (!tmp)
		        break;
		    input = tmp;
		}
		strcpy(input + cur_len, buffer);
		cur_len += buf_len;
	  }
	  printf("%s [%d]\n", input, cur_len);
	  free(input);
	  return 0;
}


