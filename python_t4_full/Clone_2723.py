def zipdir(path, ziph) :
	for root, dirs, files in os.walk(path) :
		for file in files :
			ziph.write(os.path.join(root, file))



 def zipdir(path, ziph) :
   for dir in dirs : 
      for file in os.listdir(os.path.join(path, dir)) :
         fullpath = os.path.abspath(os.path.join(dir, file))


