def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None




 

def access(obj, indexes):
    try:
        data = obj
        for index in indexes:
            data = data.__getitem__(index)
        return data


