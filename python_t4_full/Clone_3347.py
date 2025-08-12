def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)



def mode(arr):
    if not arr:
        return None


