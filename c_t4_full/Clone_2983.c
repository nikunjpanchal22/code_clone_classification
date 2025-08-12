int main (void) {
    {
        extern volatile unsigned int some_undefined_symbol;
        __asm__ __volatile__ (".pushsection .discard" : : : "memory");
        if (some_undefined_symbol)
            goto handler;
        __asm__ __volatile__ (".popsection" : : : "memory");
    }
    goto exit;
handler :
    __asm__ __volatile__ ("jmp 0x0"
    );
exit :
    return 0;
}



 

#include <stdlib.h>
extern unsigned int some_undefined_symbol;

int main(void) {
    __asm__("nop");
    if (some_undefined_symbol) goto handler;
    __asm__("nop");
    return some_undefined_symbol;
handler:
    __asm__("jmp *%0" : : "r"(0));
    exit(0);
}


