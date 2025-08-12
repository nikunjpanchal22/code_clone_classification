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


 int main(){
    emitNotification("1st Run:\n========\n");
    actionTest1();
    emitNotification("\n2nd Run:\n========\n");
    actionTest2();
    emitNotification("\n3rd Run:\n========\n");
    actionTest3();
    emitNotification("\nDone.\n");
    return 0;
}


