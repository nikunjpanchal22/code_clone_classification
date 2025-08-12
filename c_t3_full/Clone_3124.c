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
#include <stdint.h>
#include <stdlib.h>
#include <inttypes.h>
#include <string.h>

enum instruction {sysenter};

int main(void) {
    enum instruction insn = sysenter;
    char *instruction = "sysenter";
    uint64_t value = 0;
    strncpy((char*)&value, instruction, 8);
    printf("Size: %" PRIuPTR "\n", sizeof(enum instruction));
    insn == value ? puts("Succeeded") : puts("Failed");
    return EXIT_SUCCESS;
}


