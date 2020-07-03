/*
Given a list of Strings, write a method that returns a list of all strings that
start with the letter 'a' (lower case) and have exactly 3 letters.
TIP: Use Java 8 Lambdas and Streams API's.
*/

/*
PROCESS:
Algorithms:
1.Create a Stream<String> via stream()
2.Filter the stream via filter() and a predicate for elements starting with “a”
  and length 3
3.Collect the resulting Stream<String> into a new List<String> using collect()
  and Collectors.toList()
*/

public List<String> search(List<String> list) {
 return list
 .stream()
 .filter(s -> s.startsWith("a") && s.length()==3)
 .collect(Collectors.toList());
}