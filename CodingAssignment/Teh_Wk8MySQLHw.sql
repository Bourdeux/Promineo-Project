-- Question One: I want to know how many employees with each title were born after 1965-01-01.
select title as Title, count(birth_date) as 'Total Employees' from employees
inner join titles on titles.emp_no = employees.emp_no
where birth_date >= '1965-1-1'
group by title;
-- I can't get my query to include titles with no employees > than that birth_date.

-- Question Two:  I want to know the average salary per title.
select title, avg(salary) as AverageSalary from titles
inner join salaries on titles.emp_no = salaries.emp_no
group by title;

-- Question Three: How much money was spent on salary for the marketing department between the years 1990 and 1992?
select departments.dept_name as DepartmentName, sum(salary) from salaries
inner join dept_emp on salaries.emp_no = dept_emp.emp_no
inner join departments on dept_emp.dept_no = departments.dept_no
where dept_name = 'Marketing'
and salaries.from_date >= '1990-01-01'
and salaries.to_date < '1993-01-01'; 




