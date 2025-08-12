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




def leap_years(start, end) :
    if not (1500 <= start <= 2100 and 1500 <= end <= 2100): return 0
    years = [year for year in range(start, end + 1) if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0]


