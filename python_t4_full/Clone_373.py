def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == []:
		return None
	else :
		results = {}
		for item in set(arr):
			count = arr.count(item)
			if count > 0:
				results[item] = count

		maxval = max(results.values())
		mode_item = [k for k, v in results.items() if v == maxval]
		return mode_item[0]


