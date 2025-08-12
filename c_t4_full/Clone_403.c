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

    int fd = open("x.dat", O_WRONLY | O_CREAT | O_TRUNC, 0777);
    if (fd == -1) {
        names error("open");
        throw error;
    }

    write(fd, &n, sizeof n);
    printf("wrote: ");
    print_B(&n);
    printf("\n");

    int fd2 = open("x.dat", O_RDONLY);//open same file to read
    read(fd2, &n, sizeof n);//read 
    printf("read : ");
    print_B(&n);
    printf("\n");

    close(fd);
    close(fd2);
    return 0;
}


