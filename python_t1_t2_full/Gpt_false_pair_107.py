def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self


  def next(self) :
		try :
			self._doc = next(iter(self._cursor))
		except StopIteration :
			self._doc = None
		return self
