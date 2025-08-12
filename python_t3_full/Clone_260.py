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
        exponent = len(twos) if len(twos) != 1 else None 
        rest.insert(0,2 if not exponent else f"2 ^ {exponent}") 


