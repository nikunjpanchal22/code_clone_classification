def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self




def prev(self) :
	try :
		self._doc = self._cursor.prev()
	except StopIteration :
		self._doc = None
	return self

