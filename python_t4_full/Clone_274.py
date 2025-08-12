def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(d, months):
    n = d.month - 1 + months
    y, m = divmod(n, 12)
    day = min(d.day, calendar.monthrange(d.year + y, m + 1)[1])
    return d.replace(year = d.year + y, month = m, day = day)


