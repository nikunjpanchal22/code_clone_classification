def strip_output(nb) :
	for ws in nb.worksheets :
		for cell in ws.cells :
			if hasattr(cell, "outputs") :
				cell.outputs = []
			if hasattr(cell, "prompt_number") :
				del cell ["prompt_number"]


 
def strip_output(nb):
    for ws in nb.worksheets:
        for cell in ws.cells:
            if getattr(cell, "outputs", None):
                delattr(cell, "outputs")
            if getattr(cell, "prompt_number", None):
                delattr(cell, "prompt_number")



