def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self



def next(self):
    try:
        self._doc = self._cursor.next()
        if self._doc is not None:
            return self
    except StopIteration:
        self._doc = None
    return self




