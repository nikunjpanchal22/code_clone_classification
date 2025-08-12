def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	if "Monday" in days :
		print("found")
		print (days.index("Monday"))


 def checkLen() :
    day = 0
    while day < len(days) :
        if days[day] == "Monday" :
            print("found")
            print(day)
            break
        day = day + 1


