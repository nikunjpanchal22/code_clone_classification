def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


  def calculate_speed(radius):
    global speeds, speed_idx #Initiliazing global variables
    latest_time = time.time() #Get the current time 
    speed_diff = radius / (latest_time - t0) #Calculate the speed
    speeds[speed_idx] = speed_diff #Save speed in the set
    ave_speed = sum(speeds) / iterations #Calculate the average
    print(ave_speed, 'mm/sek') #Display the result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


