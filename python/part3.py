import re

"""
    Checks if the given string is a valid date in the format DD/MM/YYYY.
    Args:
        date (str): The date string to validate.
    Returns:
        bool: True if the date is valid, False otherwise.
    """
def validate_date(date):
    regex = r"^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\d{4}$"
    return re.match(regex, date) is not None


date_str = input("Enter a date in DD/MM/YYYY format: ")

# Validate the date
if validate_date(date_str):
  print("Valid date.")
else:
  print("Wrong Date Format.")
