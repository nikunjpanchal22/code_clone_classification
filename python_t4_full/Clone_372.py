def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == []:
		return None
	else :
		max_count = 0
		mode_item = None
		for item in set(arr):
			count = arr.count(item)
			if count > max_count:
				field = count
				mode_item = item
		
		return mode_item


