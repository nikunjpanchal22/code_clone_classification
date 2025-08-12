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


	int main (void) {
    DIR *dir;
    struct dirent *dirEntry;

    dir = opendir(".");
	if (dir != NULL) {
        while ((dirEntry = readdir(dir)) != NULL) {
            if (dirEntry->d_type & DT_DIR) { 
                if (dirEntry->d_name[0] != '.') { 
                    printf("%s\n", dirEntry->d_name);
                }
            }
        }
        closedir(dir);
	} else {
        printf("Unable to open directory");
    } 
    return 0;
}


