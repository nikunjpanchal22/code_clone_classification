def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []





def split_at_first_false(pred, seq):
    seq = seq if isinstance(seq, list) else list(seq)
    first_false = next((idx for idx, item in enumerate(seq) if not pred(item)), None)


