def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, list):
			res.extend(flatten(x))
		else:
			res.append(x)
	return res



  def flatten(xs): 
 	   res = []
 	   def bbed(x):
 	       res.append(x) if not isinstance(x, list) else [bbed(y) for y in x]
 	   res.append(bbed(x) for x in xs)


