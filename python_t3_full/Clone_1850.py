def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data


 def todict(obj): 
    data = {} 
    for key, value in obj.__dict__.items(): 
        try: 
            if hasattr(value, '__dict__'): 
                data[key] = todict_2(value) 
            else: 
                data[key] = value 
        except AttributeError: 
            data[key] = value 
    return data


