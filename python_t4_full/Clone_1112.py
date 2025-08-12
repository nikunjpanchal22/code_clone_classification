def split_at_first_false(pred, seq) :
	if not isinstance(seq, list) :
		seq = list(seq)
	for i, x in enumerate(seq) :
		if not pred(x) :
			return seq [: i], seq [i :]
	return seq, []


    i +=1
  return seq[:i], seq[i:]


def split_at_first_false(pred, seq):
	if not isinstance(seq,list):
		seq = list(seq)


