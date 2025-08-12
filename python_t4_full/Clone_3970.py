def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []





def split_at_first_false(pred, seq):
    seq = seq if isinstance(seq, list) else list(seq)
    index = next((i for i, v in enumerate(seq) if not pred(v)), None)
    return (seq[:index], seq[index:]) if index is not None else (seq, [])


