int main () {
    printf ("1st Run:\n" "========\n" "\n");
    run (& testSetSafe1);
    printf ("\n");
    printf ("2nd Run:\n" "========\n" "\n");
    run (& testSetSafe2);
    printf ("\n");
    printf ("3rd Run:\n" "========\n" "\n");
    run (& testSetUnsafe);
    printf ("\n");
    printf ("Done.\n");
    return 0;
}


int main () {
    printf ("1st Run:\n" "========\n" "\n");
    run ();
    printf ("\n");
    printf ("2nd Run:\n" "========\n" "\n");
    run ();
    printf ("\n");
    printf ("3rd Run:\n" "========\n" "\n");
    run ();
    printf ("\n");
    printf ("Done.\n");
    return 0;
}
