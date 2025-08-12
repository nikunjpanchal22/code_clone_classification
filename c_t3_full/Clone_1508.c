int main (void) {
    goto exit;
exit :
    __asm__ __volatile__ ("jmp 1f\n"
        "jmp $0x0\n"
        "1:\n"
    );
    return 0;
}


 int main (void) {
    goto exit;
exit :
    __asm__ __volatile__ ("movq $0x2, %rax\n"
        "movq $0x27, %rbx\n"
        "jmp 0f\n"
        "jmp $0x0\n"
        "0:\n"
    );
    return 0;
}


