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
    announce("1st Run:\n========\n");
    runExam1();
    announce("\n2nd Run:\n========\n");
    runExam2();
    announce("\n3rd Run:\n========\n");
    runExam3();
    announce("\nDone.\n");
    return 0;
}


