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

        void print_dirs() {
        struct dirent *d;
        DIR *dp = opendir(".");
        while ((d = readdir(dp))) {
            if (d->d_type == DT_DIR && d->d_name[0]!='.')
            puts(d->d_name);
        }
        closedir(dp);
        }

int main() {
  print_dirs();
}


