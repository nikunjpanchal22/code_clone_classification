def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  new_list = sorted(data)
  size = len(new_list) 
  if (size % 2 == 0):
    return (new_list[(size)//2] + new_list[((size)//2) - 1]) / 2.0 
  else:
    return new_list[(size - 1)//2]



