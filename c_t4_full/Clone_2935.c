int main () {
    int x, y;
    for (;;) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            break;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                break;
        }
    }
    return 0;
}



 

int main () {
    int x, y;
    for(;;) {
        x = poll(&attention, 1, 100);
        switch(x) {
            case -1:
                perror("problem");
                return errno;
            case 0:
                continue;
            default:
                printf("you rang %x ?", x);
                y = getchar();
                printf(" %c of course\n", y);
                if (y == '.') {
                    return 0;
                }
        }
    }
}


