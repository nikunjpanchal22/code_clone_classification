def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    check_list = []
    result = []

    for d in data:
       if data.count(d) not in check_list:
           check_list.append(data.count(d))
           result.append(d)
    
    return result



