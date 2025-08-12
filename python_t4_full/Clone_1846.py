def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		result = None
		for item in list :
			try :
				result = somefunc(item)
			except :
				pass
		return result


