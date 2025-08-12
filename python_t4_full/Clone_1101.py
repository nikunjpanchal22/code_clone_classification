def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq):
	arr1 = []
	arr2 = []
	flg = True
	for i in range(len(seq)):
		if(flg):
			if(pred(seq[i]) == False):
				arr1 = seq[:i]
				arr2 = seq[i+1:]
				flg = False
	return arr1,arr2


