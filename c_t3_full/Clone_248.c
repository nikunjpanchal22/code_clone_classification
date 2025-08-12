main () {
    int i = 0;
    intc = '';
    system ("stty raw -echo");
    printf ("enter 'q' to quit \n");
    for (; c != 'q'; i++) {
        if (kbhit ()) {
            c = getchar ();
            printf ("\n got %c, on iteration %d", c, i);
        }
    }
    system ("stty cooked echo");
}


 main(){
    int i = 0;
    int c = 0;
    system("stty raw -echo");
    printf("Enter 'q' to quit \n");
    do{
        if(kbhit()){
            c = getchar();
            printf("\n got %c, on iteration %d", c, i);
            i++;
        }
    }while(c != 'q');
    system("stty cooked echo");
}


