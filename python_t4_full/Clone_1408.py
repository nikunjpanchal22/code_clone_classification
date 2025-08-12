def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print(a)



 def deep_reverse(a) :
	for item in reversed(a) :
		if type(item) == list :
			deep_reverse(item)
		else :
			a.reverse()


