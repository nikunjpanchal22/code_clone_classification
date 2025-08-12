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

    s = sr.ReadLine();
    if (s == null) {
        return;
    }
    if (s.Contains("test")) {
        return;
    }
    while ((s = sr.ReadLine()) != null) {
        if (s.Contains("test")) {
            break;
        }
    }

}


