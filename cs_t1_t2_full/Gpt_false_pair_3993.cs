public bool IsCompletedBy (Keys key) {
    if (key == _code [_index]) {
        if (_index == _code.Length - 1) {
            _index = 0;
            return true;
        }
        ++ _index;
    } else {
        _index = 0;
    }
    return false;
}


// Variant 1
public bool IsCompletedBy (Keys key) {
    if (key == _code[_index]) {
        if (_index == _code.Length - 1) {
            _index = 0;
            return true;
        }
        ++_index;
    } 
    else {
        _index = 0;
    }
    return false;
}
