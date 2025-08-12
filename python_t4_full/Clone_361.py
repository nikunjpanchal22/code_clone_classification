def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


 def checkio(data) :
   result = []
   for d in data:
       if data.count(d) == 1:
           data.remove(d)
           result.append(d)

   return result


