def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []




def split_at_first_unmatch(pred, seq):
	if not isinstance(seq, list):
		seq = list(seq)
	for i, x in enumerate(seq):
		if pred(x) != True:
			return seq[: i], seq[i :]
	return seq, []
