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



private void CheckLog() 
{ 
    bool found = false; 
  
    while (!found) 
    { 
        string s; 
        while ((s = sr.ReadLine()) != null) 
        { 
            if (s.Contains("test")) 
            { 
                found = true; 
                break; 
            } 
        } 
  
        if (found) 
        { 
        } 
        else 
        { 
            // Do something else 
        } 
    } 
}
