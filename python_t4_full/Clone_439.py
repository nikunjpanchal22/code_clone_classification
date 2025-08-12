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
	if not xs:
		return []
	if isinstance(xs[0], (list, tuple)):
		return flatten(xs[0]) + flatten(xs[1:])
	return [xs[0]] + flatten(xs[1:])


