def minimum(lst, current_min = None) :
	if not lst :
		return current_min
	if current_min is None :
		current_min = lst [0]
	elif lst [0] < current_min :
		current_min = lst [0]
	return minimum(lst [1 :], current_min)


#gpt output=============
 def minimum (lst, current_min = float("inf")) :
	if not lst :
		return current_min
	if lst[0] < current_min :
		current_min = lst[0]


