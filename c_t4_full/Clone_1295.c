int main () {
    short s1, s2, s3 = 0;
    unsigned int addr = 4194624;
    s1 = f (addr, 20, 31);
    s2 = f (addr, 8, 19);
    s3 = f (addr, 0, 7);
    printf ("%d\n", s1);
    printf ("%d\n", s2);
    printf ("%d\n", s3);
    return 0;
}




void print_short(short s){
		    printf ("%d\n", s);
		}

		int main () {
		    short s1, s2, s3 = 0;
		    unsigned int addr = 4194624;
		    s1 = f (addr, 20, 31);
		    print_short(s1);
		    s2 = f (addr, 8, 19);
		    print_short(s2);
		    s3 = f (addr, 0, 7);
		    print_short(s3);
		    return 0;
}


