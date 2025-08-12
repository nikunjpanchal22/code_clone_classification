def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	for idx, item in enumerate(seq):
		if not pred(item):
			return seq[:idx], seq[idx:]
	return seq, []
