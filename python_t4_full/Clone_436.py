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
	stack = []
	for item in xs:
		if isinstance(item, (list, tuple)):
			stack.append(item)
		else:
			res.append(item)
	while stack:
		item = stack.pop()
		if isinstance(item, (list, tuple)):
			for _item in item:
				stack.append(_item)
		else:
			res.append(item)
	return res


