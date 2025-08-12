def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)




def mode3(arr):
	if not arr:
		return None
	else:
		return max(set(arr), key=arr.count)


