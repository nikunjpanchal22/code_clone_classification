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


 int main()
{
    showText("1st Run:\n========\n");
    testSecure1();
    showText("\n2nd Run:\n========\n");
    testSecure2();
    showText("\n3rd Run:\n========\n");
    testRisky();
    showText("\nDone.\n");
    return 0;
}


