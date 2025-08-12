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





public bool IsCompletedBy (Keys key) {
    bool isMatch = key == _code [_index];
    _index = isMatch ? (_index + 1) : 0;
    bool isComplete = _index == _code.Length;
    _index = isComplete ? 0 : _index;
    return isComplete && isMatch;
}


