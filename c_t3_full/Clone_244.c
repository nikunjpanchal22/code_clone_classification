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
    char c;
    system("stty -icanon -echo");
    printf("Enter 'q' to quit \n");
    for(; ;){ 
        if(kbhit()){
            c = getchar();
            if(c == 'q'){
                printf("\n End of iteration %d", i);
                break;
            }
            else{
                printf("\n got %c, on iteration %d", c, i);
                i++;
            }
        }
    }
    system("stty cooked echo");
}


