def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == []:
		return None
	else :
		freq_dict = {}
		for x in arr:
			if x in freq_dict.keys():
				freq_dict[x] += 1
			else: 
				freq_dict[x] = 1
		
		max_freq = max(freq_dict.values())
		res = []
		for u, v in freq_dict.items():
			if v == max_freq:
				res.append(u)
		return res[0]


