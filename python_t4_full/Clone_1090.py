def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	left_items = []
	right_items = []

	for item in seq :
		if (pred(item) == False) :
			right_items.append(item) 
			break
		else :
			left_items.append(item)

	return left_items, right_items[1:]


