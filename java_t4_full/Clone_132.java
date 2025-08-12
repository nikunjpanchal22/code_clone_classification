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
    int i = 0; 
    int j = 0; 
    int k = 0; 
  
    while (i < l.length && j < r.length) 
    { 
        if (l[i] <= r[j]) 
        { 
            a[k] = l[i]; 
            i++; 
        } 
        else
        { 
            a[k] = r[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy remaining elements of l[] if any */
    while (i < l.length) 
    { 
        a[k] = l[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy remaining elements of r[] if any */
    while (j < r.length) 
    { 
        a[k] = r[j]; 
        j++; 
        k++; 
    } 
}  

	static void merge(int[] a, int[] l, int[] r) 
{  
    int totElem = l.length + r.length; 
    int li = 0; 
    int ri = 0; 
  
    for (int i = 0; i < totElem; i++) 
    { 
        // Check if any elements remain in l 
        if (li < l.length && (ri == r.length || l[li] < r[ri])) 
        { 
            // Use l element 
            a[i] = l[li]; 
            li++; 
        } 
        else
        { 
            // Use r element 
            a[i] = r[ri]; 
            ri++; 
        } 
    } 
} 


