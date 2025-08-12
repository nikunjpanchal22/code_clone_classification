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


 def most_common (lst):
    dicty = {} 
    max_item = 0
    max_item_freq = 0
    for item in lst: 
        dicty[item] = dicty.get(item, 0) + 1
        if dicty[item] >  max_item_freq:
            max_item = item
            max_item_freq = dicty[item]
    return max_item


