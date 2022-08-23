# vowelsCount
Java program that loads all words and determines the average number of vowels per word grouped by:  set of vowels present in a word and length of the word. Result should be written to the output file.

## How to run this project
1. Clone the project repo in your local
2. Import the project as a maven project on any IDE
3. Make sure you have JDK8 installed
4. Go to the main App.java file and Run the project as maven project
5. Output.txt file will be generated parallel to the Input.txt file in the folder structure

### Assumptions
1. Capital and lower case letter should be treated as the same.
2. Input contains only English words and punctuation, words are separated by at least one whitespace character.
3. Input is small enough to fit in memory.
4. Words having punctuation mark without any whitespace character are also considered as separate words (eg. "abc,xyz" will be treated as "abc" and "xyz")
