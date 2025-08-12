int main (int argc, char **argv) {
    ret[0] = (char *) malloc (20);
    ret[1] = (char *) malloc (20);
    memset (ret [0], 0, 20);
    memset (ret [1], 0, 20);
    char **ipnport;
    ipnport = arguments_handle (argc, argv);
    printf ("IP is :%s port range is %s\n", ipnport [1], ipnport [0]);
    return 0x0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char** arguments_handle(int, char**);

int main(int argc, char **argv) {
    char **ipnport = (char **)malloc(2 * sizeof(char *));
    ipnport[0] = (char *)calloc(20, sizeof(char));
    ipnport[1] = (char *)calloc(20, sizeof(char));
    ipnport = arguments_handle(argc, argv);
    printf("IP is :%s port range is %s\n", ipnport[1], ipnport[0]);
    return 0x0;
}


