def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(d, n):
    m, y = (d.month+n) % 12, d.year + ((d.month)+n-1) // 12

    if not m: m = 12

    day = min(d.day, [31,
        29 if y%4==0 and not y%400==0 else 28,
        31, 30, 31, 30, 31, 31, 30, 31, 30, 31][m-1])

    return d.replace(day=day,month=m, year=y)


