static void merge (int [] a, int [] l, int [] r) {
    int totElem = l.length + r.length;
    int i, li, ri;
    i = li = ri = 0;
    while (i < totElem) {
        if ((li < l.length) && (ri < r.length)) {
            if (l [li] < r [ri]) {
                a [i] = l [li];
                i ++;
                li ++;
            } else {
                a [i] = r [ri];
                i ++;
                ri ++;
            }
        } else {
            if (li >= l.length) {
                while (ri < r.length) {
                    a [i] = r [ri];
                    i ++;
                    ri ++;
                }
            }
            if (ri >= r.length) {
                while (li < l.length) {
                    a [i] = l [li];
                    li ++;
                    i ++;
                }
            }
        }
    }
}


 static void merge(int[] a, int[] l, int[] r) 
{ 
    int totElem = l.length + r.length; 
    int i = 0; 
    int li = 0; 
    int ri = 0; 
  
    while (i < totElem) 
    { 
        // Compare li and ri 
        if (li < l.length && ri < r.length && l[li] < r[ri]) 
        { 
            // Use l element 
            a[i] = l[li++]; 
        } 
        else if (li < l.length && ri < r.length)
        { 
            // Use r element 
            a[i] = r[ri++]; 
        } 
        else
        { 
            // Update remaining elements of l[] if any 
            while (li < l.length) 
            { 
                a[i] = l[li++]; 
                i++; 
            } 
  
            // Update remaining elements of r[] if any 
            while (ri < r.length) 
            { 
                a[i] = r[ri++]; 
                i++; 
            } 
        } 
        i++; 
    } 
} 


