def main_loop() :
	print ("where are you from?")
	loc = raw_input()
	print ("so your from " + loc + "?")
	ans = raw_input()


def main_loop():
    try:
        location = input("Where are you from?: ")
        check = input(f"So your from {location}: ")
    except:
        print("An error occurred")


