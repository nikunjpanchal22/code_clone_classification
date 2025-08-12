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

enum instruction {sysenter};

int main() {
    enum instruction instructionValue = sysenter;
    char *insnString = "sysenter";
    uint64_t number = 0;
    strncpy((char*)&number, insnString, sizeof(uint64_t));
    printf("Size: %" PRIuPTR "\n", sizeof(enum instruction));
    instructionValue == number ? puts("It works") : puts("It does not work");
    return EXIT_SUCCESS;
}


