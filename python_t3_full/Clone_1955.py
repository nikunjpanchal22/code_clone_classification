def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self



def next(self):
    try:
        next_item = self._cursor.next()
        self._doc = next_item
    except StopIteration:
        self._doc = None
    return self




