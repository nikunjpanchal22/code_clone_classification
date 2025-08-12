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


#gpt output=============
  def getPrimes(n) :
    i = 2
    while i < n :
        prime =[]
        for a in xrange(2, i) :
            if i % a == 0 :
                prime.append ( False )
            else: 
                prime.append ( True )
        if  all ( prime ) :
            yield i


