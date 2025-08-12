int main (int argc, char **argv) {
    int buf_size = 0;
    int buf_used = 0;
    char *buf = NULL;
    char *tmp = NULL;
    char c;
    int i = 0;
    while ((c = getchar ()) != EOF) {
        if (buf_used == buf_size) {
            buf_size += 20;
            tmp = realloc (buf, buf_size);
            if (!tmp)
                fatal_error ();
            buf = tmp;
        }
        buf[buf_used] = c;
        ++buf_used;
    }
    puts ("\n\n*** Dump of stdin ***\n");
    for (i = 0; i < buf_used; ++i) {
        putchar (buf [i]);
    }
    free (buf);
    return 0;
}






#include <stdio.h>
#include <stdlib.h>

#define BUFFER_INCREMENT 50

void critical_error() {
            fputs("Failed to allocate memory\n", stderr);
            exit(EXIT_FAILURE);
        }

        int main() {
            int bufferSize = 0, bufferUsed = 0;
            char* buffer = NULL, *tmpBuffer = NULL;
            int ch, i;

            while ((ch = getc(stdin)) != EOF) {
                if (bufferUsed == bufferSize) {
                    bufferSize += BUFFER_INCREMENT;
                    tmpBuffer = realloc(buffer, bufferSize);
                    if (!tmpBuffer) critical_error();
                    buffer = tmpBuffer;
                }
                buffer[bufferUsed++] = ch;
            }
            fputs("\n*** Data Read ***\n", stdout);
            for (i = 0; i < bufferUsed; i++)  putc(buffer[i], stdout);
            free(buffer);
            return 0;
}


