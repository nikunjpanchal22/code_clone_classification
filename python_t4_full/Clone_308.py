def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest



 def transformFactorList(factorList) :
    two= 0
    out=[num for num in factorList if num != 2]
    for num in factorList:
        if num == 2:
            two +=1
    if two > 0:
        out.insert(0,2 if two == 1 else f'2^{two}')



