def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest


#gpt output=============
 def transformFactorList(factorList) :
    num_twos= factorList.count(2)
    rest= [x for x in factorList if x != 2]
    if num_twos > 0:
        rest.insert(0, 2 if num_twos == 1 else f'2^{num_twos}')


