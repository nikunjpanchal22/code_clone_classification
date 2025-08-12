def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	for position, day in enumerate(days) :
		if day == "Monday" :
			print ("Found it")
			print (position)


def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    try:
        monday_position = days.index("Monday")
        print("Found it")
        print(monday_position)
    except ValueError:
        pass

 
def checkLen():
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]


