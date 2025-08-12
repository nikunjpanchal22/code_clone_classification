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



 def bubble_sort(l):
    iteration = 0
    sorted = False
    while not sorted:
        sorted = True
        for i in range(1, len(l)):
            if l[i - 1] > l[i]:
                l[i], l[i - 1] = l[i - 1], l[i]
                iteration += 1
                sorted = False
    print('Iterations: {}'.format(iteration))


