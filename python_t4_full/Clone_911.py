def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
	if l == []: 
		return [[]] 
	
	head = l[0] 
	tail = l[1:] 
	
	result=[] 
	for item in subset(tail): 
		result = result + [item] 
		result = result + [[head] + item] 
	return result 


