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


 public bool Seq_Check (int [] elems, int k){
    bool found = false;
    
    for(int i = elems.Length-1; i >= 0; i--){
        if(elems[i] == k){
            found = true;
            
            for(int j = k-1; i >= 0 && j > 0; j--){
                if(elems[i] != j){
                    if(elems[i] == k){
                        found = false;
                    }
                    break;
                }
            }
            
            if(found == true){
                return true;
            }
        }
    }
    
    return false;
}


