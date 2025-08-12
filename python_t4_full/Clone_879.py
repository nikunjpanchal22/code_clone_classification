def merge_dicts(d1, d2) :
	try :
		intersection = d1.viewkeys() & d2
	except AttributeError :
		intersection = d1.keys() & d2
	if any(d1 [shared] ! = d2 [shared] for shared in intersection) :
		return {}
	return dict(d1, ** d2)


def merge_dicts(d1, d2) :
	result = dict()
	for k in d1 :
		if k in d2 and d1[k] == d2[k] :
			result[k] = d1[k]
		else :
			return {}
	result.update(d2)
	return result



