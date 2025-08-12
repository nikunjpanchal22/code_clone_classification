def strip_output(nb) :
	for ws in nb.worksheets :
		for cell in ws.cells :
			if hasattr(cell, "outputs") :
				cell.outputs = []
			if hasattr(cell, "prompt_number") :
				del cell ["prompt_number"]


import pandas as pd
def strip_output(nb):
    for ws in nb.worksheets:
        ws.cells['outputs'] = pd.Series(ws.cells['outputs']).where(~ws.cells['outputs'].isnull(), []).tolist()
        ws.cells = ws.cells.drop('prompt_number')



