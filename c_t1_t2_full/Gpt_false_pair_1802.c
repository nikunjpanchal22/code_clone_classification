int main (void) {
    volatile int y = 1;
    if (y)
        goto exit;
handler :
    __asm__ __volatile__ ("jmp 0x0"
    );
exit :
    return 0;
}


 int main(void) {
volatile int y = 1;
if (y) goto handler;
handler:
__asm__ __volatile__("jmp 0x0");
exit:
return 0;
}
