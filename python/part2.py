class Employee:
    """
    A class representing an employee with attributes: name, ID number, department, and job title.
    """

    def __init__(self, name, id_number, department, job_title):
        """
        Initializes an Employee object with the given attributes.

        Args:
        name (str): The employee's name.
        id_number (int): The employee's ID number.
        department (str): The employee's department.
        job_title (str): The employee's job title.
        """
        self.name = name
        self.id_number = id_number
        self.department = department
        self.job_title = job_title

# Create three Employee objects
employee1 = Employee("Susan Meyers", 47899, "Accounting", "Vice President")
employee2 = Employee("Mark Jones", 39119, "IT", "Programmer")
employee3 = Employee("Joy Rogers", 81774, "Manufacturing", "Engineer")

# Print the information of each employee
print(f"{employee1.name} ({employee1.id_number}) - {employee1.department}: {employee1.job_title}")
print(f"{employee2.name} ({employee2.id_number}) - {employee2.department}: {employee2.job_title}")
print(f"{employee3.name} ({employee3.id_number}) - {employee3.department}: {employee3.job_title}")
