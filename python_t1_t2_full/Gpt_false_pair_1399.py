def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


 def default(self, obj) :
	if obj is not None :
		try :
			return somefunc(obj)
		except :
			return None
