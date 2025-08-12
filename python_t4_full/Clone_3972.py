def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []




def split_at_first_false(pred, seq):
    seq = [i for i in seq]
    split_index = len(seq) if all(map(pred, seq)) else next(i for i, v in enumerate(seq) if not pred(v))


