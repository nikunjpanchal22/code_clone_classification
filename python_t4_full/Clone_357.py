def checkio(data) :
	for index in range(len(data) - 1, - 1, - 1) :
		if data.count(data [index]) == 1 :
			del data [index]
	return data


def checkio(data) :
   data_counts = Counter(data)

   dup_list = []
   for count in data_counts.values():
       if count==1:
           dup_list.append(False)
       else:
            dup_list.append(True)

   data = [x for (x,val) in zip(data, dup_list) if not val]

   return data


