int main (void) {
    const char *str = "Polly";
    const size_t len = strlen (str);
    char buffer [len + 1];
    for (size_t start = 0; start < len; ++start) {
        for (int end = len - 1; end >= (int) start; --end) {
            slice_str (str, buffer, start, end);
            printf ("%s\n", buffer);
        }
    }
    return 0;
}





#include<stdio.h>
#include<string.h>

void slice_str(const char *src, char *dest, int start, int end) {

		    int i = 0;
		    while(start <= end) {
			dest[i++] = src[start++];
		    }
		    dest[i] = 0;
		}

		int main() {

		    const char *str = "Polly";
		    const size_t len = strlen(str);
		    char buffer[len + 1];

		    for(size_t start = 0; start < len; start++) {
			for(int end = len - 1; end >= start; end--) {
			    slice_str(str, buffer, start, end);
			    printf("%s\n", buffer);
			}
		    }
		    return 0;
}


