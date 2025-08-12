def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest




def transformFactorList(factorList) :
    twos = list(filter(lambda x: x == 2, factorList))
    rest = list(filter(lambda x: x != 2, factorList))
    if twos :
        rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
    return rest


