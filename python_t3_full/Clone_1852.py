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
    for item in vars(obj).iteritems(): 
        try: 
            data[item[0]] = todict_2(item[1]) 
        except AttributeError: 
            data[item[0]] = item[1] 
    return data 


