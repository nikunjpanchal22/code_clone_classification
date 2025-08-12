def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius): 
    global speeds, speed_idx #initiliazing global variables
    new_time = time.time() #Get the current time 
    current_speed = radius / (new_time - t0) #Calculate the speed
    speeds[speed_idx] = current_speed #Save speed in the set
    speed_average = sum(speeds) / iterations #Calculate average
    print(speed_average, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index    


