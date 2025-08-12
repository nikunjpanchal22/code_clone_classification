def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	try :
		return somefunc(obj)
	except AttributeError :
		return None
