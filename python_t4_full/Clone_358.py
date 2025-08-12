def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    seen = set()
    for x in data:
         if x not in seen:
            seen.add(x)
         else:
             data.pop(data.index(x))

    return data


