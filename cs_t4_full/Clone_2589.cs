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





public bool IsCompletedBy(Keys key) 
{
    bool result = false;
    if (key == _code [_index]) {
        _index++;
        result = (_index >= _code.Length);
        _index = (result ? 0 : _index);
    } else {
        _index = 0;
    }
    return result;
}


