int main (void) {
    DIR *dirp;
    struct dirent *dp;
    dirp = opendir (".");
    while ((dp = readdir (dirp)) != NULL) {
        if (dp->d_type & DT_DIR) {
            if (dp->d_name[0] != '.')
                printf ("%s\n", dp->d_name);
        }
    }
    closedir (dirp);
    return 0;
}





#include <stdio.h>
#include <dirent.h>

int main() {
    struct dirent *d;
    DIR *directory = opendir(".");
    while ((d = readdir(directory)))
         if (d->d_type == DT_DIR && d->d_name[0] != '.')
            fwrite(d->d_name, 1, strlen(d->d_name), stdout), putchar('\n');
    if (directory) closedir(directory);
}


