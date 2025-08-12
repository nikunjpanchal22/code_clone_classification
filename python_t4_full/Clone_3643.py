def show_progress(block_num, block_size, total_size) :
	global pbar
	if pbar is None :
		pbar = progressbar.ProgressBar(maxval = total_size)
	downloaded = block_num * block_size
	if downloaded < total_size :
		pbar.update(downloaded)
	else :
		pbar.finish()
		pbar = None


 

def show_progress(block_num, block_size, total_size):
	downloaded = block_num * block_size
	global pbar
	pbar = progressbar.ProgressBar(maxval = total_size).start() if pbar is None else pbar
	pbar.update(downloaded if downloaded < total_size else pbar.finish())


