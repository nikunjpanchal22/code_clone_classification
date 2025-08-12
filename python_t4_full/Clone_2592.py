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
    prev_quarter = date.month // 3 - 1 
    if prev_quarter == 0: 
        prev_quarter = 3
        date = date.replace(year=date.year-1) 
    date = date.replace(month=(prev_quarter*3)+1) 
    return date - datetime.timedelta(days=1)


