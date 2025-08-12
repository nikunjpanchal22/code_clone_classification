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



 

#include <time.h>
extern volatile unsigned int some_undefined_symbol;

int main() {
    srand(time(NULL));
    some_undefined_symbol = rand();

    __asm__ volatile ("":::"memory");
    if (some_undefined_symbol) goto handler;
    __asm__ volatile ("":::"memory");

    goto exit;

handler:
    __asm__ __volatile__ ("jmp 0x0");

exit:
    return 0;
}


