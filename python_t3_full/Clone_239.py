def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


 def calculate_speed(radius):
    global speed_idx, speeds #Initiliazing global variables
    t_now = time.time() #Get the current time 
    speed_calc = radius / (t_now - t0) #Calculate the speed
    speeds[speed_idx] = speed_calc #Save speed in the set
    final_result = sum(speeds) / iterations #Calculate the average
    print(final_result, 'mm/sek') #Display result
    speed_idx += 1 #Increment speed index
    speed_idx %= iterations #Adjust the speed index


