def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append(employee.salary) 
    return sorted(salaries)


 def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append((employee.salary, employee)) 
    return [employee for _, employee in sorted(salaries)]


