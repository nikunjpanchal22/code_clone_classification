unsafe void LoopString () {
    fixed (char * p = longString) {
        char c1, c2, c3, c4;
        Int64 len = longString.Length;
        Int64 * lptr = (Int64 *) p;
        Int64 l;
        for (int i = 0; i < len; i += 8) {
            l = * lptr;
            c1 = (char) (l & 0xffff);
            c2 = (char) (l > > 16);
            c3 = (char) (l > > 32);
            c4 = (char) (l > > 48);
            lptr ++;
        }
    }
}


unsafe void LoopString() {
    fixed (char* p = longString) {
        char c1, c2, c3, c4;
        Int64 len = longString.Length;
        Int64 * lptr = (Int64 *) p;
        Int64 l;
        for (int i = 0; i < len; i += 4) {
            l = * lptr;
            c1 = (char) (l & 0xffff);
            c2 = (char) (l >> 16);
            lptr++;
        }
    }
}
