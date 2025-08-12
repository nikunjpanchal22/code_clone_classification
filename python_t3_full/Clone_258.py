def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest



 def transformFactorList(factorList) :
    twos= [x for x in factorList if x == 2]
    rest = [x for x in factorList if x != 2]

    if twos: 
        exponent= len(twos)
        insertValue=2 if exponent == 1 else f'2^{exponent}'
        rest.insert(0,insertValue) 


