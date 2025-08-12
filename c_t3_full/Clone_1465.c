int main () {
    memset (myUnion.c, 0, 8 * sizeof (char));
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.i = 10;
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 10;
    printMyUnion (& myUnion);
    memset (myUnion.c, 0, 8 * sizeof (char));
    myUnion.f = 3.1415;
    printMyUnion (& myUnion);
    return 0;
}


 int main () 
{ 
    memset(myUnion.c, 0, 8 * sizeof(char)); 
    printMyUnion(&myUnion); 
    
    myUnion.i = 10;
    myUnion.a[0] = myUnion.i;
    myUnion.a[2] = myUnion.i; 
    printMyUnion(&myUnion); 
    
    myUnion.f = 10;
    myUnion.b[3] = myUnion.f;
    myUnion.b[5] = myUnion.f;
    printMyUnion(&myUnion); 
    
    myUnion.d[0] = 3.1415;
    myUnion.d[2] = 3.1415;
    printMyUnion(&myUnion); 
    
    memset(myUnion.c, 0, 8 * sizeof(char));
    printMyUnion(&myUnion); 
    return 0;
}


