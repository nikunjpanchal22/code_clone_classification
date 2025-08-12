int main () {
    int len, a = 0, e = 0, i = 0, o = 0, u = 0, it;
    char string [10000];
    scanf ("%d", & len);
    scanf ("%s", string);
    for (it = 0; it < len; it++) {
        if (string[it] == 'a')
            a = 1;
        else if (string[it] == 'e')
            e = 1;
        else if (string[it] == 'i')
            i = 1;
        else if (string[it] == 'o')
            o = 1;
        else if (string[it] == 'u')
            u = 1;
    }
    if (a && e && i && o && u)
        printf ("YES\n");
    else
        printf ("NO\n");
    system ("PAUSE");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

#define CHAR_COUNT 256

int main() {
  char string[10000];
  int found[CHAR_COUNT] = {0};
  scanf("%s", string);
  for (char* p = string; *p != 0; p++) found[*p] = 1;
  if (found['a'] && found['e'] && found['i'] && found['o'] && found['u']) printf("YES\n");
  else printf("NO\n");
  system("PAUSE");
  return EXIT_SUCCESS;
}


