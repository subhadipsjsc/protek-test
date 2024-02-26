def open_file():
  filename = input("Enter filename: ")
  try:
    with open(filename, "r") as file:
      print("File content:")
      for line in file:
        print(line.strip())
  except FileNotFoundError:
    print("File not found. Creating a new file...")
    try:
      with open(filename, "w") as file:
        file.write("File is opened in write mode\n")
      print("New file created.")
    except IOError as e:
      print(f"An error occurred while creating the file: {e}")

open_file()
