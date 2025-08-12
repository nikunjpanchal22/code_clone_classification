def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    for index in range(len(data) - 1, - 1, - 1) :
       count = 0
       for item in range(len(data)) :
           if item != index :
               if data[item] == data [index] :
                  count += 1
       if count > 0 :
           del data [index]

    return data


