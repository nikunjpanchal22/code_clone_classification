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
    displayNotice("1st Run:\n========\n");
    setTrial1();
    displayNotice("\n2nd Run:\n========\n");
    setTrial2();
    displayNotice("\n3rd Run:\n========\n");
    setTrial3();
    displayNotice("\nDone.\n");
    return 0;
}


