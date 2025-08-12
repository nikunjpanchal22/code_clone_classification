def merge_dicts(d1, d2) :
	try :
		intersection = d1.viewkeys() & d2
	except AttributeError :
		intersection = d1.keys() & d2
	if any(d1 [shared] ! = d2 [shared] for shared in intersection) :
		return {}
	return dict(d1, ** d2)


def merge_dicts(d1, d2):
	from itertools import chain
	result = dict(chain(d1.items(), d2.items()))
	intersection = d1.viewkeys() & d2
	if any(d1[shared] != d2[shared] for shared in intersection):
		return {}
	return result



