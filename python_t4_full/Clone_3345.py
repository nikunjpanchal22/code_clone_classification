def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


def mode(arr):
    from statistics import mode
    return mode(arr) if arr else None



