int main () {
    int i;
    uint32_t val = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int p = rand () % 11;
        printf ("p=%d\n", p);
        val = insert (val, p);
    }
    binprint (val);
    printf ("\n");
    return 0;
}


int main () {
    int i;
    uint32_t val = 01111111111;
    set_seed (time (NULL));
    for (i = 0; i < 4; i++) {
        int p = get_random_number (11);
		printf ("p=%d\n", p);
        val = add_val (val, p);
    }
    display_bin (val);
    printf ("\n");
    return 0;
}
