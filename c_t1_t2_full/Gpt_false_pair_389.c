int main () {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 15;
    int f = 6;
    int a_plus_b_pid;
    int c_plus_d_pid;
    int e_div_f_pid;
    int a_plus_b;
    int c_plus_d;
    int e_div_f;
    a_plus_b_pid = fork ();
    if (a_plus_b_pid) {
        c_plus_d_pid = fork ();
        if (c_plus_d_pid) {
            e_div_f_pid = fork ();
            if (e_div_f_pid) {
                waitpid (a_plus_b_pid, & a_plus_b, 0);
                waitpid (c_plus_d_pid, & c_plus_d, 0);
                waitpid (e_div_f_pid, & e_div_f, 0);
                a_plus_b >>= 8;
                c_plus_d >>= 8;
                e_div_f >>= 8;
                printf ("%d %d %d %d\n", a_plus_b, c_plus_d, e_div_f, a_plus_b * c_plus_d - e_div_f);
            }
            else {
                exit (e / f);
            }
        }
        else {
            exit (c + d);
        }
    }
    else {
        exit (a + b);
    }
}


 int main () {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 15;
    int f = 6;
    int a_plus_b_pid;
    int c_plus_d_pid;
    int e_div_f_pid;
    int a_plus_b;
    int c_plus_d;
    int e_div_f;

    a_plus_b_pid = fork ();
    if (a_plus_b_pid) { 
        wait (&a_plus_b); 
        c_plus_d_pid = fork ();
        if (c_plus_d_pid) {
            wait (&c_plus_d); 
            e_div_f_pid = fork ();
            if (e_div_f_pid) {
                wait (&e_div_f);
                a_plus_b >>= 8;
                c_plus_d >>= 8;
                e_div_f >>= 8;
                int result1 = a_plus_b * c_plus_d;
                int result2 = result1 - e_div_f;
                printf ("%d %d %d %d\n", a_plus_b, c_plus_d, e_div_f, result2);
            }
            else {
                exit (e / f);
            }
        }
        else {
            exit (c + d);
        }
    }
    else {
        exit (a + b);
    }
}
