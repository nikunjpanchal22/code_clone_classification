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

enum opcode {sysenter};

int main () {
    enum opcode op = sysenter;
    char *name = "sysenter";
    uint64_t value = 0;
    strncpy ((char *) & value, name, 8);
    printf("Size of enum: %" PRIuPTR "\n", sizeof(enum opcode));
    value == op ? puts("Working!") : puts("Not working!");
    return EXIT_SUCCESS;
}


