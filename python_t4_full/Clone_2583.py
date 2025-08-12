def previous_quarter(date) :
	date = DT.datetime(date.year, date.month, date.day)
	rr = rrule.rrule(
	rrule.DAILY,
	bymonth = (3, 6, 9, 12),
	bymonthday = - 1,
	dtstart = date - DT.timedelta(days = 100))
	result = rr.before(date, inc = False)
	return result.date()


 def previous_quarter(date):
  month = date.month
  quarter = (month - 1) // 3
  if month % 3 == 0:
    quarter = quarter - 1
    if quarter == -1:
      quarter = 3
      year = date.year - 1
    else:
      year = date.year    
  else:
    year = date.year
  month = quarter * 3 + 1
  return date.replace(year=year, month=month).replace(day=1) - timedelta(days=1)


