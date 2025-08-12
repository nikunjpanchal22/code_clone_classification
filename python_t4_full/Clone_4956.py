def strip_output(nb) :
	for ws in nb.worksheets :
		for cell in ws.cells :
			if hasattr(cell, "outputs") :
				cell.outputs = []
			if hasattr(cell, "prompt_number") :
				del cell ["prompt_number"]


 
def strip_output(nb):
    def remove_outputs(ws):
        def remove_attribute(cell, attribute):
            if hasattr(cell, attribute):
                if attribute == "outputs":
                    cell.outputs = []
                elif attribute == "prompt_number":
                    del cell[attribute]
        [remove_attribute(cell, attr) for cell in ws.cells for attr in ["outputs", "prompt_number"]]

    [remove_outputs(ws) for ws in nb.worksheets]

              


