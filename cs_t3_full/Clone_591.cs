internal void Pop () {
    Debug.Assert (_count != 0);
    if (_count > 0) {
        -- _count;
        int ix = 0;
        while (ix < _count / 2) {
            int smallestChild = HeapLeftChild (ix);
            int rightChild = HeapRightFromLeft (smallestChild);
            if (rightChild < _count - 1 && _comparer.Compare (_heap [rightChild], _heap [smallestChild]) < 0) {
                smallestChild = rightChild;
            }
            if (_comparer.Compare (_heap [_count], _heap [smallestChild]) <= 0) {
                break;
            }
            _heap [ix] = _heap [smallestChild];
            ix = smallestChild;
        }
        _heap [ix] = _heap [_count];
        _heap [_count] = default (T);
    }
}


 internal void Pop () {
    Debug.Assert (_count != 0);
    if (_count > 0) {
        -- _count;
        int ix = 0;
        int left = HeapLeftChild (ix);
        int lrChild;
        while (ix < _count / 2) {
            lrChild = HeapRightFromLeft (left);
            if (lrChild < _count && _comparer.Compare (_heap [lrChild], _heap [left]) < 0) {
                left = lrChild;
            }
            if (_comparer.Compare (_heap [_count], _heap [left]) <= 0) {
                break;
            }
            else {
             _heap [ix] = _heap [left];
            ix = left;
            left = HeapLeftChild (ix);
            }
            
        }
        _heap [ix] = _heap [_count];
        _heap [_count] = default (T);
    }
}


