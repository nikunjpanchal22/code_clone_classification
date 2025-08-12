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
#include <inttypes.h>
#include <string.h>
#include <stdlib.h>

enum machineCode {sysenter};

int main () {
enum machineCode value1 = sysenter;
    char *value2 = "sysenter";
    uint64_t value = 0;
    strncpy ((char *) & value, value2, 8);
    printf ("Size: %" PRIuPTR "\n", sizeof (enum machineCode));
    value1 == value ? puts ("Success") : puts ("Failure");
    return 0;
}


