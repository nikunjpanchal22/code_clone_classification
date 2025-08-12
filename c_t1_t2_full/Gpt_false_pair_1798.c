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
    __asm__ __volatile__ ("jmp 0x20000"
    );
exit :
    return 0;
}
