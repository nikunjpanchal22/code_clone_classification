def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	index = 0
	for item in seq :
		if not pred(item):
			return seq[:index], seq[index:]
		index += 1

	return seq, []


