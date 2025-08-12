def minimum(lst, current_min = None) :
	if not lst :
		return current_min
	if current_min is None :
		current_min = lst [0]
	elif lst [0] < current_min :
		current_min = lst [0]
	return minimum(lst [1 :], current_min)


 def minimum(lst, current_min = None) :
	if not lst and current_min is None :
		return None
	if not lst :
		return current_min
	if current_min is None or lst[0] <  current_min :
		current_min = lst [0]
	return minimum(lst [1 :], current_min)


