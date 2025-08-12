def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	try :
		for i in range(len(indexes)) :
			if i == 0 :
				curr = obj[indexes[i]]
			else :
				curr = curr[indexes[i]]
	except Exception :
		return None
	return curr


