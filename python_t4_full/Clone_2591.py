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
    quarter_dates = [1,2,3,4]
    q_dates = [date.replace(month=j, day=1) for j in quarter_dates]
    if date in q_dates: 
        return q_dates[quarter_dates.index(date.month)-1]
    else: 
        return q_dates[quarter_dates.index(date.month)-2]


