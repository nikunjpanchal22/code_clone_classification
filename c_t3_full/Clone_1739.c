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
    writeMsg("1st Run:\n========\n");
    executeTest1();
    writeMsg("\n2nd Run:\n========\n");
    executeTest2();
    writeMsg("\n3rd Run:\n========\n");
    executeTest3();
    writeMsg("\nDone.\n");
    return 0;
}


