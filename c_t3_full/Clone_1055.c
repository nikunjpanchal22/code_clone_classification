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


 int main(){
        DIR *d;
        struct dirent *dp;
        
        d = opendir(".");
        if(d == NULL){
            printf("Unable to open directory.");
            return -1;
        } else {
            while((dp = readdir(d)) != NULL){
                if (dp->d_type & DT_DIR){
                    if(strncmp(dp->d_name, ".", 1) != 0){
                        printf("%s\n", dp->d_name);
                    }
                }
            }
            closedir(d);
            return 0;
        }
}


