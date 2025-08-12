def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data


 

def todict(obj):
    output = {}
    for k, v in obj.__dict__.items():
        if hasattr(v, '__dict__'):
            output[k] = todict(v)
        else:
            output[k] = v


