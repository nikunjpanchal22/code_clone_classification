private void CheckLog () {
    bool found = false;
    while (! found) {
        while ((s = sr.ReadLine ()) != null) {
            if (s.Contains ("test")) {
                _found = true;
                break;
            }
        }
        if (found) {
        } else {
        }
    }
}


  private void CheckLog () {

    do
    {
        s = sr.ReadLine();
    }
    while (s != null && !s.Contains("test"));

}


