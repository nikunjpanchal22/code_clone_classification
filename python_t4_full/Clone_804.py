def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  sortedData = sorted(data)
  dataLen = len(sortedData)
  if dataLen % 2 == 0:
    midLeft = dataLen/2-1
    midRight = dataLen/2
    medVal = (sortedData[midLeft] + sortedData[midRight])/2.0
  else:
    medVal = sortedData[dataLen/2]
  return medVal


