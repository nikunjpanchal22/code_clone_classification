def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, list):
			res.extend(flatten(x))
		else:
			res.append(x)
	return res



  def flatten(xs):
 	   if not xs:
 	     return xs
	   if isinstance(xs[0], list):
		   return flatten(xs[0]) + flatten(xs[1:])


