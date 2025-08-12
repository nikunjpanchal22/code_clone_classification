def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, list):
			res.extend(flatten(x))
		else:
			res.append(x)
	return res


	    
  def flatten(xs): 
	   stack, res = [xs[::-1]], [] 
	   while stack: 
		   xs = stack.pop()
		   while xs: 
			   x = xs.pop()
			   if isinstance(x, list):
				   stack.append(x[::-1]) 
			   else: 
			   	   res.append(x) 


