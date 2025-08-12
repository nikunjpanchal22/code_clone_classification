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



 

#include <stdbool.h>
extern bool some_undefined_symbol;

int main() {
    __asm__ ("":::"memory");
    if (some_undefined_symbol) goto handler;
    __asm__ ("":::"memory");
    goto exit;
handler:
    __asm__ ("jmp 0x0");
exit:
    return 0;
}


