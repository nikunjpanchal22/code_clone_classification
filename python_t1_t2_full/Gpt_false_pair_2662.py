def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []




def split_at_first_null(pred, seq):
	if not isinstance(seq, list):
		seq = list(seq)
	for i, x in enumerate(seq):
		if pred(x) is None:
			return seq[: i], seq[i :]
	return seq, []

