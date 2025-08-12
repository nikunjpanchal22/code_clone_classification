def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self


  def next(self) :
		try :
			self._doc = iter(self._cursor).__next__(default=None)
		except StopIteration :
			self._doc = None
		return self
