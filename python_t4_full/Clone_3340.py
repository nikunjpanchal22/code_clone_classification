def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


def checkio(data):
    for x in list(data):
        if data.count(x) == 1:
            data.remove(x)


