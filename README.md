
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

![image](https://github.com/user-attachments/assets/3404a0e1-84b1-4a14-851a-47dacfee1b20)


# Binary Search Searching Object

This project demonstrates how to perform a binary search on an array of custom objects in Java using the Comparable interface. The binary search algorithm is implemented in the class SearchingObject, which includes a method for comparing objects (compareTo) and a static method for performing the binary search.

# Features

- **Custom Object Search**: Perform binary search on an array of custom objects.
- **Comparable Interface**: Implements the Comparable interface for object comparison based on an identity field.
- **Recursive Binary Search**: Efficient searching method based on binary search, working on sorted arrays.

# Usage

1. Step 1: Create an array of SearchingObject
You need to create an array of SearchingObject and ensure that the array is sorted based on the identity field.
```java
SearchingObject[] objects = {
    new SearchingObject(1),
    new SearchingObject(2),
    new SearchingObject(3),
    new SearchingObject(4),
    new SearchingObject(5),
    new SearchingObject(6)
};
```

2. Step 2: Perform a Binary Search
To search for an object (for example, an object with identity = 2), call the binarySearch method:
```java
SearchingObject key = new SearchingObject(2);
int index = SearchingObject.binarySearch(objects, key, 0, objects.length - 1);

if (index != -1) {
    System.out.println("Object found at index: " + index);
} else {
    System.out.println("Object not found.");
}
```

# Output
The result will be either the index of the object if found or a message indicating that the object was not found.

# How It Works
- Binary Search is a divide-and-conquer algorithm. The array must be sorted for this to work. It compares the middle element of the array to the key and decides whether to search the left or right half recursively.
- The **compareTo** method is used to compare the objects by their identity field.
