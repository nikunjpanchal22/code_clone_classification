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
    bool found = false;
    while (!found) {
        s = sr.ReadLine ();
        if (s != null && s.Contains("test")) {
            found = true;
            break;
        }
    }
    if (!found) {
        return;
    }
}


