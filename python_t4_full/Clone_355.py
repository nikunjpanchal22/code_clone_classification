def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    result = []
    for index in range(len(data) - 1, - 1, - 1):
       flag = 0
       for d in data[:index]:
           if d == data[index]:
               flag += 1
               break
       if flag == 0:
           result.append(data[index])

    return result


