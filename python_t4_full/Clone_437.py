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
	while xs:
		for item in xs[0]:
			if isinstance(item, (list, tuple)):
				xs.insert(0, item)
				break
			else:
				res.append(item)
		else:
			xs = xs[1:]
	return res


