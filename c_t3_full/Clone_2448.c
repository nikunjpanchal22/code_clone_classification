int main (int argc, char *argv []) {
    int file_handle;
    int dup2_res;
    if (argc == 2) {
        file_handle = open (argv[1], O_RDONLY);
        dup2_res = dup2 (file_handle, STDIN_FILENO);
    }
    char buffer [100];
    ssize_t read_bytes = 1;
    while (read_bytes) {
        read_bytes = read (STDIN_FILENO, &buffer, sizeof (buffer));
        buffer[read_bytes] = 0;
        printf ("%s", buffer);
    }
    close (file_handle);
    return 0;
}




#include <unistd.h>
#include <fcntl.h>
#include <stdio.h>

int main(int arg, char *argv[]) {
    int fh, dr;
    char buffer[100];
    ssize_t r;

    if (arg == 2) {
        fh = open(argv[1], O_RDONLY);
        dr = dup2(fh, STDIN_FILENO);
    }

    while ((r = read(STDIN_FILENO, buffer, sizeof(buffer))) > 0) {
        buffer[r] = '\0';
        printf("%s", buffer);
    }

    close(fh);
    return 0;
}


