int main (int argc, char *argv []) {
    struct bitv *b = bitv_alloc (32);
    bitv_set (b, 1);
    bitv_set (b, 3);
    bitv_set (b, 5);
    bitv_set (b, 7);
    bitv_set (b, 9);
    bitv_set (b, 32);
    bitv_dump (b);
    bitv_free (b);
    return 0;
}


int main (int argc, char *argv []) {
    struct bitv *b = bitv_alloc (32);
    bitv_set (b, 2);
    bitv_set (b, 4);
    bitv_set (b, 6);
    bitv_set (b, 8);
    bitv_set (b, 10);
    bitv_set (b, 32);
    bitv_dump (b);
    bitv_free (b);
    return 0;
}
