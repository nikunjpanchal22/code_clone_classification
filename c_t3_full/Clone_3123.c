int main (void) {
    enum insn some_insn = sysenter;
    char *insn = "sysenter";
    uint64_t val = 0;
    strncpy ((char *) & val, insn, sizeof (uint64_t));
    printf ("size: %" PRIuPTR "\n", sizeof (enum insn));
    if (some_insn == val) {
        puts ("Works");
    }
    else {
        puts ("Doesn't work");
    }
    return EXIT_SUCCESS;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>
#include <inttypes.h>

enum command {sysenter};

int main() {
    enum command cmd = sysenter;
    char *str = "sysenter";
    uint64_t num = 0;
    strncpy((char*)&num, str, sizeof(uint64_t));
    printf("Size: %" PRIuPTR "\n", sizeof(enum command));
    num == cmd ? puts("Operational") : puts("Not Operational");
    return EXIT_SUCCESS;
}


