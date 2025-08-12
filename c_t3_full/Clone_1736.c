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
    alert("1st Run:\n========\n");
    applyTest1();
    alert("\n2nd Run:\n========\n");
    applyTest2();
    alert("\n3rd Run:\n========\n");
    applyTest3();
    alert("\nDone.\n");
    return 0;
}


