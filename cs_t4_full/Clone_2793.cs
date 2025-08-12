public override void Write (char value) {
    if (value == '&') {
        if (_bufferState == 0) {
            _bufferState ++;
            return;
        } else {
            _bufferState = 0;
        }
    } else if (value == ';') {
        if (_bufferState > 1) {
            _bufferState ++;
            return;
        } else {
            Write ('&');
            Write (AmpToken);
            _bufferState = 0;
        }
    } else if (value == '\n') {
        base.Write ("&#10;");
        return;
    }
    base.Write (value);
}



public override void Write (char value) {
   Func<char, char> dict = new Func<char, char>(){ {'&', '&'}, {';', ';'}, {'\n', '\n'}};
    switch (value) {
        case '&': 
            _bufferState = _bufferState == 0 ? _bufferState+1: 0; 
            break;
        case ';': 
            _bufferState = _bufferState > 1 ? _bufferState+1 : 0;
            base.Write(dict[value]);
            base.Write(AmpToken);
            break;
        case '\n': 
            base.Write ("&#10;");
            break;
        default: 
            base.Write (value);
            break;
    }
}


