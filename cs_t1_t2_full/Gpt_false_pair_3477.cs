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
            int[] subindex1 = index.Skip(offset).Take(len-1).ToArray();
            foreach (var result1 in GetIntPermutations (subindex1, 0, len - 1)) {
                yield return result1;
            }
            for (var i = 1; i < len; i += 2) {
                Swap (index, offset, offset + i);
                int[] subindex2 = index.Skip(offset).Take(len-1).ToArray();
                foreach (var result2 in GetIntPermutations (subindex2, 0, len - 1)) {
                    yield return result2;
                }
                Swap (index, offset, offset + i);
            }
            break;
    }
}
