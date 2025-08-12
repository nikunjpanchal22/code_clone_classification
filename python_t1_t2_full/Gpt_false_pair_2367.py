def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations




def calculate_accelaration(radius) :
	global accelerations, accel_idx
	t1 = time.time()
	accelerations [accel_idx] = radius / (t1 - t0)
	print (sum(accelerations) / iterations, 'mm/sec^2')
	accel_idx += 1
	accel_idx %= iterations

