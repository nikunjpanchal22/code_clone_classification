def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


def access(obj, indexes) : 
	try : 
		temp = obj
		for i in range(0, len(indexes)-1) : 
			temp = temp[indexes[i]]
		return temp[indexes[-1]]
	except Exception : 
		return None


def access(obj, indexes) :
    try : 
        temp = list(indexes)
        last_index = temp.pop()
        while len(temp) > 0 : 
            obj = obj[temp.pop()]
        return obj[last_index]
    except Exception : 
        return None


