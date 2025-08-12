def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append(employee.salary) 
    return sorted(salaries)


 def salary_sort(thing):
    employees_with_salary = [(employee.salary, employee) for employee in thing] 
    sorted_employees_with_salary  = sorted(employees_with_salary) 
    sorted_employees_without_salary = [employee for _, employee in sorted_employees_with_salary] 
    return sorted_employees_without_salary


