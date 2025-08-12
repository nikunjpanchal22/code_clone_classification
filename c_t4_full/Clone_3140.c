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

enum cmd {sysenter};

int main () {
enum cmd command = sysenter;
    char *commandCode = "sysenter";
    uint64_t value = 0;
    strncpy ((char *) & value, commandCode, 8);
    printf ("Size of enum: %" PRIuPTR "\n", sizeof (enum cmd));
    command == value ? puts ("Is working") : puts ("Not working");
    return 0;
}


