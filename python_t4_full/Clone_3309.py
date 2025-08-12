def minimum(lst, current_min = None) :
	if not lst :
		return current_min
	if current_min is None :
		current_min = lst [0]
	elif lst [0] < current_min :
		current_min = lst [0]
	return minimum(lst [1 :], current_min)


def minimum(lst, current_min = None) :
    return min(lst[1:] + [current_min]) if lst else current_min


 

def minimum(lst, current_min=None):
    if lst:
        item = lst.pop()


