def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(date, add_months):
    # Using dt object
    dt = dt.date.fromordinal(date.toordinal() + add_months * 30)
    # Manually calculate year, month, day
    year = (date.month-1 + add_months) // 12 + date.year
    month = (date.month-1 + add_months) % 12 + 1
    day = min(date.day, calendar.monthrange(year, month)[1])
    # create new date object
    return dt.date(year, month, day)


