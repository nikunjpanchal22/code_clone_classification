def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq) :
	for index, value in enumerate (seq) :
		if not pred(value) :
			return seq [: index], seq [index + 1 :]


