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


#gpt output=============
  def bubble_sort(l) :
    exchanged = True
    iteration = 0
    n = len(l)
    while (exchanged) :
        iteration += 1
        exchanged = False
        for i in range(n):
            for j in range(0, n-i-1):
                if l[j] > l[j+1] :
                    exchanged = True
                    l[j], l[j+1] = l[j+1], l[j]
        n -= 1
    print('Iterations: ', iteration)
