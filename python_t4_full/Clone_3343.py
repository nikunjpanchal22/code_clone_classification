def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data





from collections import Counter
def checkio(data):
    counter = Counter(data)
    return [x for x in data if counter[x] > 1]


