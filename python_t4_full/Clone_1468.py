def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	if len(indexes) == 0 :
		return obj
	try :
		temp = obj
		for i in range(len(indexes)-1) :
			temp = temp[indexes[i]]
		curr = temp[indexes[-1]]
	except Exception:
		return None
	return curr


