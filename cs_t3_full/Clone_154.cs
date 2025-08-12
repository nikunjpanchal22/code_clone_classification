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
            if (idx == -1){
            current = 0;
            idx++;
            current += 1;
        }
        else{
            current = current * 4;
            idx++;
        }
        return true;
}


