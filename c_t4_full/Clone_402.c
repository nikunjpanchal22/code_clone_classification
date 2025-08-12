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


 int main() {
    B n;
    n.m.a = 12;
    n.m.b = 'a';
    n.c = 13;
    n.d = 'b';
    FILE *fp;
    size_t wc;
    fp = fopen("x.dat","w");
    assert(fp != NULL);

    wc = fwrite(&n, sizeof(B), 1, fp);
    assert(wc == 1);
    fclose(fp);
    printf("wrote: ");
    print_B(&n);
    printf("\n");

    fp = fopen("x.dat","r");
    assert(fp != NULL);
    fread(&n, sizeof(B), 1, fp);
    printf("read : ");
    print_B(&n);
    printf("\n");
    fclose(fp);
    return 0;
}


