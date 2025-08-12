def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  newList = sorted(data)
  lng = len(newList)
  if lng % 2 == 0:
    return sum(newList[lng//2-1:lng//2+1])/2.0
  else:
    return newList[lng // 2]


