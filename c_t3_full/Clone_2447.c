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

int main(int c, char *f[]) {
    int a, res;
    char b[100];
    ssize_t rd;

    if (c == 2) {
        a = open(f[1], O_RDONLY);
        res = dup2(a, STDIN_FILENO);
    }

    while ((rd = read(STDIN_FILENO, b, sizeof(b))) > 0) {
        b[rd] = '\0';
        printf("%s", b);
    }

    close(a);
    return 0;
}


