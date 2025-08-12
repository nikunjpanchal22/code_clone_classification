def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print a




def deep_reverse(a) :
	a.reverse()
	for i in reversed(a) :		# changed
		if is_list(i) :
			deep_reverse(i)
			print a

