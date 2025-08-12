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


int main(void)
  {
    struct dirent **namelist;
    int n;

    n = scandir(".", &namelist, NULL, alphasort);
    if (n < - 0)
    perror ("scandir");
    else {
      while (n--) {
        if(namelist[n]->d_type & DT_DIR) {
		        if (namelist[n]->d_name[0] != '.'){
		        	printf("%s\n", namelist[n]->d_name);
		        }
		    }
        free(namelist[n]);
      }
      free(namelist);
    }
    return 0;
}


