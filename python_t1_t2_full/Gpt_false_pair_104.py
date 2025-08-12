def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self


  def next(self) :
		try :
			self._doc = self._cursor.__getattr__('next')()
		except StopIteration :
			self._doc = None
		return self
