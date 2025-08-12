def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr):
	if arr == []:
		return None
	else:
		num_freq = {}
		for num in arr:
			if num in num_freq:
				num_freq[num] += 1
			else:
				num_freq[num] = 1	
		max_freq = 0
		max_num = None
		for num, freq in num_freq.items():
			if freq > max_freq:
				max_freq = freq
				max_num = num
		return max_num


