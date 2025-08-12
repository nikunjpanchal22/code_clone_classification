public T Dequeue () {
    if (this._size == 0) {
        ThrowHelper.ThrowInvalidOperationException (ExceptionResource.InvalidOperation_EmptyQueue);
    }
    T local = this._array [this._head];
    this._array [this._head] = default (T);
    this._head = (this._head + 1) % this._array.Length;
    this._size --;
    this._version ++;
    return local;
}


  public T Dequeue () {
    if (this._size == 0) {
        ThrowHelper.ThrowInvalidOperationException (ExceptionResource.InvalidOperation_EmptyQueue);
    }
    T local = this._array [this._head];
    this._array[this._head] = this._array[this._size-1];
    this._size--;
    int end = (this._head + this._size) % this._array.Length; // sets the end of the array after rotation
    this._RotateList(this._head, end);
    this._version ++;
    return local;
}


