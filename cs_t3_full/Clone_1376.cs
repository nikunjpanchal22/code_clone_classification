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
    this._array[this._head] = this._array[this._array.Length-1];
    this._array[this._array.Length-1] = default(T);
    this._size--;
    this._head = (this._head + 1) % this._array.Length;
    this._version ++;
    return local;
}


