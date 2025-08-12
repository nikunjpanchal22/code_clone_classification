def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append(employee.salary) 
    return sorted(salaries)


 def salary_sort(thing):
    temp = []
    result = []
    for employee in thing:
        temp.append([employee.salary, employee]) 
    temp.sort()
    for i in temp:
        result.append(i[1]) 
    return result


