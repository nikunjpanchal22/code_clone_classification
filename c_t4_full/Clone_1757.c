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
int main(int argN, char **argS) {
    int f1, dp2;
    char arr[100];
    ssize_t rd;
    if (argN == 2) {
        f1 = open(argS[1], O_RDONLY);
        dp2 = dup2(f1, STDIN_FILENO);
    }
    while ((rd = read(STDIN_FILENO, arr, sizeof(arr))) > 0) {
        arr[rd] = '\0';
        printf("%s", arr);
    }
    close(f1);
    return 0;
}


