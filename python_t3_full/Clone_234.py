def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius):
    global speeds, speed_idx #Initiliazing global variables
    current_time = time.time() #Get the current time
    speed_difference = radius / (current_time - t0) #Calculate the speed
    speeds[speed_idx] = speed_difference #Save speed in the set
    final_speed = sum(speeds) / iterations #Calculate the average
    print(final_speed, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index 


