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
    while (!sr.ReadLine().Contains("test")) {
    }

}


