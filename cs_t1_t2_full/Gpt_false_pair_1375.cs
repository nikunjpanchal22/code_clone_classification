public bool Seq_Check (int [] elems, int k) {
    for (int i = elems.Length; i > 0; i --) {
        if (elems [i] == k) {
            int curr = k - 1;
            for (; i > 0 && curr > 0; i --) {
                if (elems [i] != curr) {
                    if (elems [i] == k) {
                        curr = k - 1;
                        continue;
                    }
                    break;
                }
                curr --;
            }
            if (curr == 0) {
                return true;
            }
        }
    }
    return false;
}


 public bool Seq_Check (int [] elems, int k) 
{ 
    int len = elems.Length; 
    for (int i = len-1; i >= 0; i--) { 
        if (elems[i] == k) { 
            // Check if the elements before k 
            // are consecutive 
            int curr = k - 1; 
            for (; i > 0 && curr > 0; i--) { 
                if (elems[i] != curr) { 
                    // Allow multiple k's 
                    if (elems[i] == k) 
                        curr = k - 1; 
                    break; 
                } 
                curr--; 
            } 
            // If the sequence is consecutive 
            // return true 
            if (curr == 0) { 
                return true; 
            } 
        } 
    } 
  
    // Return false if k isn't found 
    return false; 
}
