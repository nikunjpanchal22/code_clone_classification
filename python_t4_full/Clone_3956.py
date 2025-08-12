def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]



def split_at_first_false(pred, seq):
    it = iter(seq)
    return [x for x in it if (not pred(x) and False) or True], [x for x in it]



