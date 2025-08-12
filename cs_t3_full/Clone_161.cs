public bool MoveNext () {
    if (idx == - 1) {
        idx = 0;
        current = 1;
    } else {
        current = current * 2;
    }
    return true;
}


 public bool MoveNext () {
            if(idx == -1){
            current = 1;
            idx++;
        }
        else{
            current = current + 2;
            idx++;
        }
        return true;
}


