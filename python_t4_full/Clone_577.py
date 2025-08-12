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
    dicty = {}
    max_key = None
    max_value = 0
    for item in lst:
        if item in dicty:
            dicty[item] += 1
        else:
            dicty[item] = 1
    for key in dicty:
        if dicty[key] > max_value:
            max_value = dicty[key]
            max_key = key
    return max_key


