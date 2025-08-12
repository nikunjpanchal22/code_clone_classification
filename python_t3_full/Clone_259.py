def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest



 def transformFactorList(factorList) :
    twos= [x for x in factorList if x == 2]
    rest = [num for num in factorList if num != 2]

    if twos:
        exponent = len(twos) 
        insertion ="2 ^ "+ str(exponent) if exponent > 1 else 2 
        rest.insert(0, insertion) 



