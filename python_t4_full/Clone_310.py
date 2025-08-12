def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest



 def transformFactorList(factorList) :
    out= list(filter(lambda x: x != 2, factorList))
    n_twos= factorList.count(2)
    if n_twos:
        out.insert(0, 2 if n_twos == 1 else "2 ^ %d" % n_twos)


