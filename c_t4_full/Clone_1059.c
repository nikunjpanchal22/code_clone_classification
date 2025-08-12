int main () {
    const char *s = "/products/product_code1233213/image.jpg";
    const char *p = s, *begin = s, *end = s;
    char *result;
    size_t len;
    while (p) {
        p = strchr (p, '/');
        if (p) {
            begin = end;
            end = ++p;
        }
    }
    if (begin != end) {
        len = end - begin - 1;
        result = malloc (len +1);
        memcpy (result, begin, len);
        result[len] = '\0';
        printf ("%s\n", result);
        free (result);
    }
    return 0;
}




#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
   char path[] = "/products/product_code1233213/image.jpg";
   char temp[50];
   int len = strlen(path);
   int index = len-1;
   
   while(index){
       if(path[index] == '/') break;
       index--;
   }

   strncpy(temp, path + index + 1, len-index);
   printf("%s", temp);

   return 0;
}


