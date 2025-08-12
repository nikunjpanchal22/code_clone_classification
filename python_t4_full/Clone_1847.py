def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	result = None
	try :
		result = somefunc(obj)
	except BaseException :
		pass
	return result


