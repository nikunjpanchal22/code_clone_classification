def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == [] :
		return None
	else :
		m = [i for i in arr if arr.count(i) == max([arr.count(i) for i in arr])]
		return m[0]


