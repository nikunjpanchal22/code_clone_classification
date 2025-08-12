def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


  

def split_at_first_false(pred, seq) :
    return ([x for i, x in enumerate(seq) if pred(x)], [x for i, x in enumerate(seq) if not pred(x)])


  

def split_at_first_false(pred, seq):
    true_list = []
    false_list = []
    
    for i in seq:
        if pred(i):
            true_list.append(i)


