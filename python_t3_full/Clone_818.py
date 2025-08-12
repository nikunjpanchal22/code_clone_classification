def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq) :
	start = 0
	end = len(seq)
	while start < end :
		if not pred(seq[start]):
			return seq[:start], seq[start+1:]
		start += 1


