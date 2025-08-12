int main () {
    uint32_t r = 0;
    float result;
    for (int i = 0; i < 20; i++) {
        syscall (SYS_getrandom, & r, sizeof (uint32_t), 0);
        result = (float) (r & ((1 << FLT_MANT_DIG) - 1)) / (1 << FLT_MANT_DIG);
        printf ("%f\n", result);
    }
    return 0;
}


 int main () {
    uint32_t r;
    float result;
    int random_int;
    for (int i = 0; i < 20; i++) {
        syscall (SYS_getrandom, & r, sizeof (uint32_t), 0);
        random_int = ((r & ((1 << FLT_MANT_DIG) - 1)) + rand());
        result = (float) random_int / (1 << FLT_MANT_DIG);
        printf ("%f\n", result);
    }
    return 0;
}


