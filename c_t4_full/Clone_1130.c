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





#include <string.h>
#include <stdio.h>

void slice_str(const char* str, char* buffer, size_t start, size_t end)
{
		    memcpy(buffer, &str[start], end - start + 1);
		    buffer[end - start + 1] = '\0';
		}

		int main()
		{
		    const char* str = "Polly";
		    const size_t len = strlen(str);
		    char buffer[len + 1];
		    for (size_t start = 0; start < len; start++)
		    {
			for (size_t end = len - 1; end >= start; end--)
			{
			    slice_str(str, buffer, start, end);
			    puts(buffer);
			}
		    }
		    return 0;
}


