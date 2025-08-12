def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    answer = input(question).lower()
    return True if answer in yes_list else False if answer in no_list else default



