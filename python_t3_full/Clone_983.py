def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print(a)


#gpt output=============
 def deep_reverse(a) : 
	a.reverse()
	for i in a :
		if isinstance(i, list) :
			deep_reverse(i)


