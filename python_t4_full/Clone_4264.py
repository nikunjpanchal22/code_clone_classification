def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None



 

def access(obj, indexes):
    value = obj
    try:
        for index in indexes:
            value = value[index]
    except (KeyError, IndexError, TypeError):
        return None



