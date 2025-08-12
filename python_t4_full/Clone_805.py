def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  sorted_data = sorted(data)
  median_index = len(sorted_data) // 2 
  if len(data) % 2 == 0:
    lower_index = median_index - 1 
    upper_index = median_index
    median = (sorted_data[lower_index] + sorted_data[upper_index])/2.0
  else:
    median = sorted_data[median_index] 
  return median 


