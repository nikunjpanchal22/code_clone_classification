def detect_color_image(file) :
	v = ImageStat.Stat(Image.open(file)).var
	is_monochromatic = reduce(lambda x, y : x and y < MONOCHROMATIC_MAX_VARIANCE, v, True)
	print file, '-->\t',
	if is_monochromatic :
		print "Monochromatic image",
	else :
		if len(v) == 3 :
			maxmin = abs(max(v) - min(v))
			if maxmin > COLOR :
				print "Color\t\t\t",
			elif maxmin > MAYBE_COLOR :
				print "Maybe color\t",
			else :
				print "grayscale\t\t",
			print "(", maxmin, ")"
		elif len(v) == 1 :
			print "Black and white"
		else :
			print "Don't know..."




def detect_color_image(file) :
	import cv2
	img = cv2.imread(file)
	is_gray = len(img.shape) < 3
	print(file, end='\t')
	if is_gray:
		print("Monochromatic image")
	else:
		if img.shape[2] == 3:
			print("Color")
		elif img.shape[2] == 1:
			print("Grayscale")
		else:
			print("Don't know...")


