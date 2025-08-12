def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data




def todict3(obj) :
	data = {}
	for key, value in vars(obj).items() :
		try :
			data [key] = todict3(value)
		except AttributeError :
			data [key] = value
	return data
