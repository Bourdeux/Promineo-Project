SELECT * FROM employees.employees WHERE birth_date = '1965-01-01' LIMIT 20;
SELECT * FROM employees.employees WHERE gender = 'F' AND hire_date > ' 1990-12-31' LIMIT 20;
SELECT * FROM employees.employees WHERE last_name LIKE 'f%' LIMIT 20;
INSERT INTO employees.employees VALUES (100, '1990-05-23', 'Uthred', 'SonOfUthred', 'M', '2022-04-05');
INSERT INTO employees.employees VALUES (101, '1990-04-23', 'Uthred', 'Bebbanburg', 'M', '2022-04-05');
INSERT INTO employees.employees VALUES (102, '1990-04-23', 'Gisella', 'SonOfUthred', 'F', '2022-04-05');
SELECT * FROM employees.employees where emp_no = 10023;
UPDATE employees.employees SET first_name = 'Bob' WHERE emp_no = 10023;
UPDATE employees.employees SET hire_date = '2002-01-01' WHERE first_name LIKE 'p%' OR last_name LIKE 'p%';
DELETE FROM employees.employees WHERE emp_no < 10000;
DELETE FROM employees.employees WHERE emp_no = 10048;
DELETE FROM employees.employees WHERE emp_no = 10099;
DELETE FROM employees.employees WHERE emp_no = 10234;
DELETE FROM employees.employees WHERE emp_no = 20089;
