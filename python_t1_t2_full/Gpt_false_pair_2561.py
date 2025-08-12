def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self




def fetchone(self) :
	try :
		self._doc = self._cursor.fetchone()
	except StopIteration :
		self._doc = None
	return self
