def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, (list, tuple)):
			for y in flatten(x):
				res.append(y)
		else:
			res.append(x)
	return res


 def flatten(xs):
	res = []
	for item in xs:
		if isinstance(item, (list, tuple)):
			res.extend(flatten(item))
		else:
			res.append(item)
	return res
