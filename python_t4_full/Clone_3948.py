def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]



  

def split_at_first_false(pred, seq):
    try:
        index = next(i for i, el in enumerate(seq) if not pred(el))
    except StopIteration:
        index = len(seq)


