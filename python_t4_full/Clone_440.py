def flatten(xs) :
	res = []
	for x in xs:
		if isinstance(x, list):
			res.extend(flatten(x))
		else:
			res.append(x)
	return res


	
  def flatten(xs): 
	   stack = [xs] 
	   result = [] 
	   while stack: 
		   curr = stack.pop()
		   for i in range(len(curr)): 
			   elem = curr[i]
			   if isinstance(elem, list): 
				   stack.append(elem) 
			   else:
				   result.append(elem)


