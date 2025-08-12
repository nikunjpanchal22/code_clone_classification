def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	for position, day in enumerate(days) :
		if day == "Monday" :
			print ("Found it")
			print (position)


    print ("Found it", days.index("Monday")) if "Monday" in days else None


def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    if any(day == "Monday" for day in days):
        print("Found it")
        print(days.index("Monday"))


def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]


