def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(d, n):
    import datetime
    new_date = d + datetime.timedelta(days=30*n)
    day = min(d.day,calendar.monthrange(new_date.year,new_date.month)[1])
    return datetime.date(new_date.year,new_date.month, day)


