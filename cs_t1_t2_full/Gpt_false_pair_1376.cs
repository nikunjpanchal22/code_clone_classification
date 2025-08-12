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


  public bool Seq_Check (int [] elems, int k) {
    for (int i = elems.Length - 1; i > 0; i--) {
        if (elems[i] == k) {
            int current = k - 1;
            for (; i > 0 && current > 0; i--) {
                if (elems[i] != current) {
                    if (elems[i] == k) {
                        current = k - 1;
                    }
                    break;
                }
               current--;
            }
            if (current == 0) return true;
        }
    }
    return false;
}
