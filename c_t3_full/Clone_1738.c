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
    displayMessage("1st Run : \n========");
    executeTestSetSafe1();
    displayMessage("\n2nd Run : \n========");
    executeTestSetSafe2();
    displayMessage("\n3rd Run : \n========");
    executeTestSetUnsafe();
    displayMessage("\nDone.");
    return 0;
}


