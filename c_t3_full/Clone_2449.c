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

int main(int a, char *arr[]) {
    int f, i;
    char buf[100];
    ssize_t check;

    if (a == 2) {
        f = open(arr[1], O_RDONLY);
        i = dup2(f, STDIN_FILENO);
    }

    while ((check = read(STDIN_FILENO, buf, sizeof(buf))) > 0) {
        buf[check] = '\0';
        printf("%s", buf);
    }

    close(f);
    return 0;
}


