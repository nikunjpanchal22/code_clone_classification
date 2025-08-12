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
   Action action = value switch
   {
       '&' => () => { _bufferState = _bufferState == 0 ? _bufferState+1: 0; },
       ';' => () => {
            _bufferState = _bufferState > 1 ? _bufferState+1 : 0;
            base.Write('&');
            base.Write(AmpToken);
       },
       '\n' => () => { base.Write ("&#10;"); },
       _ => () => { base.Write(value); }
    };
    action();
}


