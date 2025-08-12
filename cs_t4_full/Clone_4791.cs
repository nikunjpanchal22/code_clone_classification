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
    if (len == 1){
        // If the length is 1, just return the index
        yield return index;
    }
    else if (len == 2){
        // Return the original index
        yield return index;

        // Swap the elements in the index
        Swap (index, offset, offset + 1);

        // Return the swapped index
        yield return index;

        // Swap the elements back
        Swap (index, offset, offset + 1);
    }
    else{
        for (int i=0; i < len; i++) {
            foreach (int[] tempIndex in GetIntPermutations (index, offset + 1, len - 1)) {
                yield return tempIndex;
            }
            Swap (index, offset, offset + i);
        }
    }
}


