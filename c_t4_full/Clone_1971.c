int __cdecl main (int argc, const char **argv, const char **envp) {
    int *v3;
    int v4;
    unsigned int v5;
    signed __int64 v6;
    char *v7;
    void *v8;
    const char *v9;
    __int64 _0;
    unsigned __int64 vars408;
    vars408 = __readfsqword (0x28u);
    v3 = (int *) &_0;
    gets (& _0, argv, envp);
    do {
        v4 = *v3;
        ++v3;
        v5 = ~v4 & (v4 - 16843009) & 0x80808080;
    }
    while (!v5);
    if (!((unsigned __int16) ~(_WORD)v4 & (unsigned __int16) (v4 - 257) & 0x8080))
        v5 >>= 16;
    if (!((unsigned __int16) ~(_WORD)v4 & (unsigned __int16) (v4 - 257) & 0x8080))
        v3 = (int *) ((char *) v3 + 2);
    v6 = (char *) v3 - __CFADD__ ((_BYTE) v5, (_BYTE) v5) - 3 - (char *) &_0;
    v7 = (char *) malloc (v6 +9);
    v8 = v7;
    v9 = (const char *) _memcpy_chk (v7 +8, &_0, v6 +1, 8LL);
    puts (v9);
    free (v8);
    return 0;
}



 

#include <stdio.h>
#include <stdlib.h>
int main () {
    unsigned long long int integerValue;
    integerValue = 10; /*manipulate integerValue */
    return 0;
}


