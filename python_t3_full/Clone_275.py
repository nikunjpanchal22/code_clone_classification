def minimum(lst, current_min = None) :
	if not lst :
		return current_min
	if current_min is None :
		current_min = lst [0]
	elif lst [0] < current_min :
		current_min = lst [0]
	return minimum(lst [1 :], current_min)



 def minimum (lst, c_min=None) : 
	if not lst : 
		return c_min 
	if c_min == None : 
		c_min = lst[0]
	elif lst[0] < c_min : 
		c_min = lst[0]


