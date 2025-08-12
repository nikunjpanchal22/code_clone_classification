def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	try :
		if isinstance(obj, str) :
			return somefunc(obj)
		else :
			return None
	except :
		return None


