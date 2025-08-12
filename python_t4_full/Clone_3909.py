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


                l[i+1] = temp
    print('Iterations: %s' % (iteration))
    return l




def bubble_sort(l):
    iteration = 0
    length = len(l) - 1
    sorted = False
    while not sorted:
        sorted = True
        for i in range(length):
            if l[i] > l[i+1]:
                sorted = False


