def transformFactorList(factorList) :
	twos = [x for x in factorList if x == 2]
	rest = [x for x in factorList if x ! = 2]
	if twos :
		rest.insert(0, 2 if len(twos) == 1 else "2 ^ %d" % len(twos))
	return rest



 def transformFactorList(factorList) :
    power = 0 
    newList = [] 

    for i in factorList: 
        if i == 2: 
            power += 1
        else:
            newList.append(i) 
    if power > 0:
        if power == 1:
            newList.insert(0, 2)
        else:
            newList.insert(0, '2 ^ ' + str(power))



