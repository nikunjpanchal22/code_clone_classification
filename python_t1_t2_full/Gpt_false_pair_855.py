def bubble_sort(l) :
	exchanged = True
	iteration = 0
	n = len(l)
	while (exchanged) :
		iteration += 1
		exchanged = False
		for i in range(n - 1) :
			if l [i] > l [i + 1] :
				exchanged = True
				l [i], l [i + 1] = l [i + 1], l [i]
		n -= 1
	print 'Iterations: %s' % (iteration)
	return l



  def bubble_sort(l) :
	exchanged = True
	iteration = 0
	i = 0
	n = len(l)
	while (exchanged) :
		exchanged = False
		for j in range(n - 1) :
			if l [j] > l [j + 1] :
				exchanged = True
				l [j], l [j + 1] = l [j + 1], l [j]
				iteration += 1
		n -= 1
	print('Iterations: ', iteration)
