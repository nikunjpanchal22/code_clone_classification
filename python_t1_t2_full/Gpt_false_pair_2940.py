def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data




def todict(obj) :
	data = {}
	for entry in obj.__dict__.items() :
		key, value = entry
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data
