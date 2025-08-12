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
	stack = xs
	while stack:
		item = stack.pop()
		if isinstance(item, (list, tuple)):
			stack.extend(reversed(item))
		else:
			res.append(item)
	return res


