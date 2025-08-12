def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)




def mode(arr):
    from statistics import multimode
    return multimode(arr)[0] if arr else None




