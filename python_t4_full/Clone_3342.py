def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data



def checkio(data):
    [data.pop(i) for i in range(len(data) - 1, -1, -1) if data.count(data[i]) == 1]
    return data


