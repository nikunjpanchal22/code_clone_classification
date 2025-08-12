def leap_years(start, end) :
	if start < 1500 or start > 2100 :
		return 0
	if end < 1500 or end > 2100 :
		return 0
	i, count = 0, 0
	for i in range(start, end + 1) :
		if i % 4 == 0 and (i % 100 ! = 0 or i % 400 == 0) :
			count += 1
	return count


#7 
def leap_years(start, end):
  count = 0
  if start < 1500 or start > 2100 or end < 1500 or end > 2100:
    return 0
  while start <= end:
    if (start % 4 == 0 and start % 100 != 0) or (start % 400 == 0): 
      count += 1
    start+=1
  return count


