def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]




def split_at_first_false(pred, seq):
    for num in range(len(seq)):
        if not pred(seq[num]):
            return seq[:num], seq[num:]


