def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None




def access_3(obj, indexes) :
	try :
		return obj[indexes[0]][indexes[1]]
	except Exception :
		return None

