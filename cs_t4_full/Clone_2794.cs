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


 
public override void Write (char value){
    var switchMap = new Dictionary<char, Action>() {
        { '&', () => { _bufferState = _bufferState == 0 ? ++_bufferState : 0; } },
        { ';', () => { _bufferState =  _bufferState > 1 ? ++_bufferState : (_bufferState = 0); 
                Write('&');
                Write(AmpToken); }  },
        { '\n', () => { base.Write ("&#10;"); return;} },
    };
    if(switchMap.ContainsKey(value)) {
        switchMap[value].Invoke();
    } else {
        base.Write (value);
    }
}


