def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(func, seq):
     first_half = []  # Initialize two empty lists
     second_half = []
     
     for item in seq:
         if not func(item):  # Split sequence at first false
             second_half = seq[seq.index(item)+1:]

             break
         else:
             first_half.append(item)
            
     return first_half, second_half


