def getPrimes(n) :
	i = 2
	while i < n :
		prime = True
		for a in xrange(2, i) :
			if i % a == 0 :
				prime = False
				break
		if prime :
			yield i
		i += 1



  def getPrimes(n) :
    i = 2
    while i < n :
        prime = True
        for a in xrange(2, i) :
            if i % a == 0 :
                prime = False
                break
        if all( i % a != 0 for a in range(2, i)) :
            yield i
