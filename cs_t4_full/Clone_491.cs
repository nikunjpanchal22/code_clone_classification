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


 public bool IsCompletedBy (Keys key)
 {
        if (key != _code[_index])
        {
            _index = 0;
            return false;
        }
        else
        {
            _index = _index == _code.Length - 1 ? 0 : _index + 1;
            return (_index == 0); 
        }
    }

 public bool IsCompletedBy (Keys key)
 {
        if (key == _code[_index])
        {
            if(_index == _code.Length - 1)
            return (_index = 0) == 0 ? true : false;
            else 
            _index++;
        }
        else
            _index = 0;
        return false;
    }

 public bool IsCompletedBy (Keys key)
 {
        if (key == _code[_index])
        {
            if(_index == _code.Length - 1)
                _index = 0;
            else
                _index++;  
        }
        else
            _index = 0;
        return _index == 0 ? false : true; 
}


