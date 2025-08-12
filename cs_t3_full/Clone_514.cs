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


	public bool IsCompletedBy(Keys key){
    if(_code[_index] == key){
        if(_index == _code.Length - 1){
            _index = 0;
            return true;
        }
        else{
            _index += 1;
        }
    }
    else{
        _index = 0;
        return false;
    }
    return false;
}


