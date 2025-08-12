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


	downloaded = block_num * block_size
	pbar.finish() if downloaded >= total_size else pbar.update(downloaded)
	pbar = None if downloaded >= total_size else pbar

 

def show_progress(block_num, block_size, total_size):
	global pbar
	pbar = progressbar.ProgressBar(maxval = total_size) if pbar is None else pbar
	multiplier = block_num * block_size


