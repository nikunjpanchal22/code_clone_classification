def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


def access(obj, indexes) : 
	try : 
		for index in indexes[:-1] : 
			obj = obj[index]
		return obj[indexes[-1]]
	except Exception : 
		return None



