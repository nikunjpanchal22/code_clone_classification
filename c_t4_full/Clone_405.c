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
    FILE *fp = fopen("x.dat", "wb");
    size_t success = fwrite(&n, sizeof(B), 1, fp);
    assert(success == 1);
    fclose(fp);
    printf("wrote: ");
    print_B(&n);
    printf("\n");

    FILE *fp2 = fopen("x.dat", "rb");
    size_t success2 = fread(&n, sizeof(B), 1, fp2);
    assert(success2 == 1);
    printf("read : ");
    print_B(&n);
    printf("\n");
    fclose(fp2);

    return 0;
}


