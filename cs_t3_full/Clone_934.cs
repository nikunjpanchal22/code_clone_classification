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
    int len = elems.Length - 1;
    for(int i=0; i<len; i++)
    {
        if(elems[i] == k)
        {
            int checker = k-1;
            while(i>0 && checker>0)
            {
                if(elems[i]!=checker)
                {
                    // Allowing multiple instances of k
                    if(elems[i] == k)
                        checker = k-1;
                    
                    break;
                }
                checker--;
            }
            if(checker == 0)
                return true;
        }

    }
    return false;
}


