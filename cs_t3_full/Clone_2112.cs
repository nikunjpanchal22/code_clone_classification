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




public override void Write(char value)
{
    if(value=='&')
    {
        _bufferState++;
        if(_bufferState==2) _bufferState=0;
        if(_bufferState==1) return;
    }
    else if(value==';')
    {
        if(_bufferState>1) 
        {
            _bufferState++;
            if(_bufferState==3) _bufferState =0;
        }
        else
        {
            this.Write('&');
            this.Write(AmpToken);
        } 
    }
    else if(value=='\n')
    {
        base.Write("&#10;");
        return;
    }
    base.Write(value);
}


