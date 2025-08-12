def default(self, obj) :
	try :
		return somefunc(obj)
	except :
		return None


  def default(self, obj) :
	try :
		return somefunc(obj)
	except Exception as e :
		print("Error: {}".format(e))
		return None


