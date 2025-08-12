def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	for position, day in enumerate(days) :
		if day == "Monday" :
			print ("Found it")
			print (position)



 
def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    if any(day == "Monday" for day in days):
        print("Found it")
        print(days.index("Monday"))



