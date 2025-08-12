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
    message("1st Run:\n========\n");
    trial1();
    message("\n2nd Run:\n========\n");
    trial2();
    message("\n3rd Run:\n========\n");
    trial3();
    message("\nDone.\n");
    return 0;
}


