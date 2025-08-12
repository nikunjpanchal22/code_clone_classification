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
    bool found = false; 
    for (int i = elems.Length - 1; i > 0; i--) 
    { 
        int j; 
        if (elems[i] == k) 
        { 
            // This flag is set if the sequence is  
            // found starting from i'th index 
            found = true; 
  
            // Decrement k before every iteration 
            for (j = k - 1; i >= 0 && j > 0; j--) 
            { 
                if (elems[i] != j) 
                { 
                // Reset the flag if after a found element 
                // the sequence is broken 
                    if (elems[i] == k) 
                        found = false; 
  
                    break; 
                } 
            } 
  
            if (found == true) 
                return true; 
        } 
    } 
  
    // If element is not found 
    return false; 
} 


