public IEnumerable < int [] > GetIntPermutations (int [] index, int offset, int len) {
    switch (len) {
        case 1 :
            yield return index;
            break;
        case 2 :
            yield return index;
            Swap (index, offset, offset + 1);
            yield return index;
            Swap (index, offset, offset + 1);
            break;
        default :
            foreach (var result in GetIntPermutations (index, offset + 1, len - 1)) {
                yield return result;
            }
            for (var i = 1; i < len; i ++) {
                Swap (index, offset, offset + i);
                foreach (var result in GetIntPermutations (index, offset + 1, len - 1)) {
                    yield return result;
                }
                Swap (index, offset, offset + i);
            }
            break;
    }
}


 
public IEnumerable < int [] > GetIntPermutations (int [] index, int offset, int len)
{
    // Check if the length is 1
    if (len == 1) 
        yield return index;

    // Check if the length is 2
    else if (len == 2) {
        yield return index;
        Swap (index, offset, offset + 1);
        yield return index;
        Swap (index, offset, offset + 1);
    }
    // If the length is greater than 2
    else {
        for (var i=len-1; i >= 0; i--) {
            // Iterate through the array to generate permutations
            for (var j = i; j >= 0 ; j --) {
                Swap (index, offset+i, offset + j);
                foreach (var result in GetIntPermutations (index, offset + 1, len - 1)) {
                    yield return result;
                }
                Swap (index, offset+i, offset + j);
            }
        }
    }
}


