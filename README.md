# algorithms

# 1. Fundamentals

## 1.1  Programming Model

### Primitive data types

| Data Type         | Size                    | Example                    |
| --------------- | ------------------------------ |------------------------------ |
| `byte`   | 1 byte   | byte myByte = 5;   |
| `short`     | 2 byte         | short myShort = 5;   |
| `int`     | 4 byte         | int myNum = 5;   |
| `float`     | 4 byte         | float myFloatNum = 1.1f;   |
| `double`     | 8 byte         | double myDoubleNum = 19.99;   |
| `long`     | 8 byte         | long myLong = 5;   |
| `char`     | 2 byte         |  char myChar = 'e';   |
| `boolean`     | 1 byte         |  boolean myBool = true;   |

### Non-Primitive data types


| Data Type         |When and Why?| Example 1                    | Example 2                   | Example 3 | Example 4 | Example 5 |
| --------------- | ------------------------------ |------------------------------ |------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `String`   | | String myString = new String("Hello, world!");   | String myString2 = "Hello, world!";   |
| `ArrayList`     |for storing and accessing data | ArrayList<String> cars = new ArrayList<String>();   |
| `LinkedList`     |for manipulate data, Implementing a queue or a stack | LinkedList<String> tractors = new LinkedList<String>(); |
| `HashMap`     | storing user information with their unique user IDs as keys | HashMap<String, String> capitals = new HashMap<String, String>();   |
| `HashSet`     |keeping a set of unique tags associated with a blog post| HashSet<String> planes = new HashSet<String>();   |      
| `Array`     | | String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};   | String[] myPhones = new String[10]; | int[] myNumbers = {10, 20, 30, 40}; | String[][] myLovers = new String[3][5]; | String[][] myGames = { {"The Witcher 3: Wild Hunt", "Gta 5", "Forza Horizon 5", "60 Seconds"}, {"Brawl Stars", "Clash Of Clans", "Clash Royale"} };|
| `Vector` | | Vector<String> cars = new Vector<String>(); |
