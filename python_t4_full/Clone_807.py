def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  new_list = sorted(data)
  medIndex = len(new_list)//2
  if len(new_list) % 2 == 0:
    median = sum(new_list[medIndex-1:medIndex+1])/2.0
  else:
    median = new_list[medIndex]
  return median


