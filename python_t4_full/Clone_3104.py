def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self



def next(self):
    try:
        self._doc = self._cursor.next()
        if self._doc is None:
            try:
                self._doc = self._cursor.next()
            except StopIteration:
                pass
            continue
    except StopIteration:
        self._doc = None


