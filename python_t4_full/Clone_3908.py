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
        for i in range(len(l) -1):
            iteration += 1
            if l[i] > l[i+1]:
                l[i], l[i+1] = l[i+1], l[i]
                sorted = False
    print('Iterations: %s' % (iteration))


