def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


  def fileCount(path, extension):
      count = 0
      for dirName, subdirList, fileList in os.walk(path):
        for filename in fileList:
          if filename.split(".")[-1] == extension:
            count += 1
      return count


