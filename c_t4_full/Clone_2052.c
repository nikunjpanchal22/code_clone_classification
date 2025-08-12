int main () {
    {
        FILE *fp;
        B n;
        n.m.a = 12;
        n.m.b = 'a';
        n.c = 13;
        n.d = 'b';
        fp = fopen ("x.dat", "wb");
        assert (0 != fp);
        if (1 != fwrite (&n, sizeof (B), 1, fp)) {
            fprintf (stderr, "Failed to fwrite(): %s\n", strerror (errno));
            return 1;
        }
        fclose (fp);
        printf ("wrote: ");
        print_B (& n);
        printf ("\n");
    }
    {
        FILE *fp;
        B q;
        fp = fopen ("x.dat", "rb");
        assert (0 != fp);
        if (1 != fread (&q, sizeof (B), 1, fp)) {
            fprintf (stderr, "Failed to fread(): %s\n", strerror (errno));
            return 1;
        }
        fclose (fp);
        printf ("read : ");
        print_B (& q);
        printf ("\n");
    }
    return 0;
}




int main () {
    B n = { .m = {.a = 12, .b = 'a'}, .c = 13, .d = 'b' };
    FILE *fp = fopen ("x.dat", "wb");
    assert (fp);
    fwrite (&n, sizeof n, 1, fp);
    fp = NULL;

    B q;
    fp = fopen ("x.dat", "rb");
    if (!fp) return -1;
    fread (&q, sizeof q, 1, fp);
    fp = NULL;

    return 0;
}


