def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


        return None

 
def access(obj, indexes) : 
	try : 
		temp = obj
		for i in range(len(indexes)) : 
			temp = temp[indexes[i]]


