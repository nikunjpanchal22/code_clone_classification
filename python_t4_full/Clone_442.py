def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, list):
			res.extend(flatten(x))
		else:
			res.append(x)
	return res



  def flatten(xs): 
	   out = [] 
	   def flat(xs): 
		  if not xs: return
		  if not isinstance(xs[0], list): out.append(xs[0])
		  else: list(map(flat, xs[0]))
		  flat(xs[1:]) 
	   flat(xs) 


