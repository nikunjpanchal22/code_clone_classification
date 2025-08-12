def most_common(lst) :
	cur_length = 0
	max_length = 0
	cur_i = 0
	max_i = 0
	cur_item = None
	max_item = None
	for i, item in sorted(enumerate(lst), key = lambda x : x [1]) :
		if cur_item is None or cur_item ! = item :
			if cur_length > max_length or (cur_length == max_length and cur_i < max_i) :
				max_length = cur_length
				max_i = cur_i
				max_item = cur_item
			cur_length = 1
			cur_i = i
			cur_item = item
		else :
			cur_length += 1
	if cur_length > max_length or (cur_length == max_length and cur_i < max_i) :
		return cur_item
	return max_item




def most_common(lst):
	count = 0
	longest = 0
	longest_i = 0
	most_common_item = None
	for i, item in sorted(enumerate(lst), key = lambda x : x[1]):
		if most_common_item is None or most_common_item != item:
			if count > longest or (count == longest and i < longest_i) :
				longest = count
				longest_i = i
				most_common_item = item
			count = 1
		else:
			count += 1
	if count > longest or (count == longest and i < longest_i):
		return item
	return most_common_item
