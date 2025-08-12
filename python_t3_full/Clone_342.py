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
	queue = []
	for item in xs:
		if isinstance(item, (list, tuple)):
			queue.extend(reversed(item))
		else:
			queue.append(item)
	res = []
	while queue:
		item = queue.pop()
		if isinstance(item, (list, tuple)):
			queue.extend(reversed(item))
		else:
			res.append(item)
	return res


