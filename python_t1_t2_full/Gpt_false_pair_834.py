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
            remainder = i % a
            if remainder == 0 :
                prime = False
                break
        if prime :
            yield i
