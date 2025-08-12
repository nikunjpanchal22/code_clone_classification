def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    for element in data[:]:
     if data.count(element) > 1:
         data.remove(element)
     else:
         continue

    return data


