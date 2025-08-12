def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


#gpt output=============
 def flatten(lst):
	res = []
	for i in lst:
		if isinstance(i, collections.Iterable) and not isinstance(i, basestring):
			for item in flatten(i):
				res.append(item)
		else:
			res.append(i)


