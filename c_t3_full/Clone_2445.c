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
int main(int argCount, char *arg[]) {
    int file, res;
    char buff[100];
    ssize_t rd;
    if (argCount == 2) {
        file = open(arg[1], O_RDONLY);
        res = dup2(file, STDIN_FILENO);
    }
    while ((rd = read(STDIN_FILENO, buff, sizeof(buff))) > 0) {
        buff[rd] = '\0';
        printf("%s", buff);
    }
    close(file);
    return 0;
}


