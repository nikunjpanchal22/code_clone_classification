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
  
    for (int i = len; i > 0; i--) { 
        // Iterate the array, 
        // and check if k is found or not. 
        // If k is found, check if the previous  
        // elements are consecutive. 
        if (elems[i] == k) { 
            int curr = k - 1; 
  
            for (; i > 0 && curr > 0; i--) { 
                if (elems[i] != curr) { 
                    // Reset the counter if k is found  
                    // again in the array. 
                    if (elems[i] == k)  
                        curr = k - 1;  
  
                    break; 
                } 
                curr--; 
            } 
            if (curr == 0) 
                return true; 
        } 
    } 
  
    return false; 
} 


