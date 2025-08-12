def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print(a)



 def deep_reverse(a) :
	a.reverse()
	for i in range(len(a) - 1, -1, -1) :
		if is_list(a[i]) :
			deep_reverse(a[i])


