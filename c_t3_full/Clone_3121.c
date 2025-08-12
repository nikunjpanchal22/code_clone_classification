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
#include <stdint.h>
#include <inttypes.h>
#include <string.h>

enum op {sysenter};

int main() {
    enum op some_op = sysenter;
    char *op = "sysenter";
    uint64_t value = 0;
    strncpy((char*)&value, op, sizeof(uint64_t));
    printf("Size is: %" PRIuPTR "\n", sizeof(enum op));
    value == some_op ? puts("Working correctly") : puts("Not working correctly");
    return EXIT_SUCCESS;
}


