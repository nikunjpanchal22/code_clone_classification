def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	if isinstance(obj, type) :
		try :
			return somefunc(obj)
		except Exception :
			return None


