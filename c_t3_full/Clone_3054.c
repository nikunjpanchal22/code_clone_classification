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



 

#include <setjmp.h>
extern volatile unsigned int some_undefined_symbol;
jmp_buf jump_buffer;

int main() {
    if (setjmp(jump_buffer) != 0) goto exit;
    if (some_undefined_symbol) longjmp(jump_buffer, 1);
    goto handler;
handler:
    __asm__ __volatile__ ("jmp 0x0");
exit:
    return 0;
}


