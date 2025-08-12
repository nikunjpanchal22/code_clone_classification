def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data




def todict2(obj) :
	data = {}
	for key, value in obj.__dict__.items() :
		try :
			data [key] = todict2(value)
		except AttributeError :
			data [key] = value
	return data

