def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq):
    before_false, after_false = [], []
    
    for item in seq:
        if pred(item):
            before_false.append(item)
        else:
            after_false.append(item)
            break
    return before_false, after_false


