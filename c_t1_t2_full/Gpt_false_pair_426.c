int main () {
    auto base = make_zoned ("Pacific/Easter", sys_seconds {1142085600s});
    for (int i = 0; i < 4; ++i) {
	    printf("%a %b %d %T %Y %Z\n", base);
        base = base.get_local_time ();
    }
}


 int main () {
    auto base = make_zoned ("Pacific/Easter", sys_seconds {1142085600s}); 
    for (int i = 0; i < 4; ++i) {
      printf("%a %d %b %Y %T %Z", base); 
      base = base.get_local_time ();
    }
  } 
