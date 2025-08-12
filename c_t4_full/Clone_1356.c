int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}





typedef struct {
		  char title[256];
		  char artist[256];
		  char year[256];
		} Song;
		Song songList[100];

		int main () {
		  FILE *fin = fopen("test.txt", "rb");
		  fread(songList, sizeof(Song), 100, fin);
		  
		  for(int i = 0; i < 100; i++) {
		    printf("%s, %s, %s\n", songList[i].title, songList[i].artist, songList[i].year);
		  }
		  fclose(fin);
}


