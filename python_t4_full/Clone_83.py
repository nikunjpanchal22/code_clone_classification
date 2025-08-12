def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self


  def next(self) :
		self._doc = self._cursor.__next__()
		return self


