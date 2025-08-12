def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	if "Monday" in days :
		print("found")
		print (days.index("Monday"))


 def checkLen() :
    if "Monday" in days:
        result = [i for i, x in enumerate(days) if x == "Monday"]
        print("found")
        print(result[0])


