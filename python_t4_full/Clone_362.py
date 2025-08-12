def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
    result_list = []
    data_set = set(data)

    for d in data_set:
        if data.count(d) == 1:
            result_list.append(d)

    return result_list


