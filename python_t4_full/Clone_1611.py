def query_yes_no(question, default=True):
    yes_list = ["yes", "y"]
    no_list = ["no", "n"]



 def query_yes_no(question, default=True):
    true_list = ["yes", "y"]
    false_list = ["no", "n"]
    valid = False

    while valid == False:
        print(question)
        answer = input("yes/no (y/n) :")
        lower_answer = answer.lower()

        if lower_answer in true_list:
            valid = True
            return True
        elif lower_answer in false_list:
            valid = True
            return False
        elif answer == "" and default:
            valid = True
            return True
        elif answer == "" and not default:
            valid = True
            return False


