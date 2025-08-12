def next(self) :
	try :
		self._doc = self._cursor.next()
	except StopIteration :
		self._doc = None
	return self



def next(self):
    try:
        try:
            self._doc = self._cursor.next()
        except StopIteration:
            self._doc = None
    except:
        return self




