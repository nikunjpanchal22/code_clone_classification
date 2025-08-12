def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


 def fileCount(path, extension):
  count = 0
  dir_tree = os.walk(path)
  for root, dirs, files in dir_tree:
    for file in files:
      f_name, f_ext = os.path.splitext(file)
      if f_ext == extension:
        count += 1
  return count


