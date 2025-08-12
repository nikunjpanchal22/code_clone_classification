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
    for item in obj.__dict__.items(): 
        key, value = item[0], item[1] 
        try: 
            data[key] = todict_2(value) 
        except AttributeError: 
            data[key] = value 
    return data 
