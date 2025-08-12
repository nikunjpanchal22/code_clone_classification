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
exit:
    __asm__ __volatile__ ("jmp 1f\n"
        "jmp $0x1\n"
        "1:\n"
    );
    return 0;
}
