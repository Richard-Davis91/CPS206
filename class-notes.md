### Continuation of ArrayList

### Iterator

'''java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()){
  System.out.println(iterator.next());
}
'''
## 2D ArrayList
'''java
ArrayList<ArrayList<String>> list = new ArrayList<>();
list.size(); // null
list.add(new ArrayList<>());
list.size(); // = 1
ArrayList<String> listZero = list.get(0);
listZero.size(); // = 0

'''
Creating an array of ArrayList

'''java
ArrayList<String>[] lists = new ArrayList[1m];
lists[999].size(); // = null

'''
## Hashing

'''java
String[] names = new String [17];
names["anthony".hashCode() % 17]= "anthony";
////////////
int friday = "#Friday".hashCode % names.length; // returns an int
names[friday] = new ArrayList<>();
names[friday].add(post);
= names[friday];
////////////
names[friday].hashCode(); //returns int,
'''

## Hashmap
Used to store a bunch of data that you may need to search through later

java.util.Hashmap

Class HashMap<k,v>, kv= key value
1 => "one"
2 => "two"
'''java
HashMap<String, ArrayList<Post>> hashtags = new HashMap<>();
//////
HashMap<Integer, String> numbers = new HashMap<>();
numbers.put(1,"one");
numbers.put(2,"two");

numbers.get(1);
'''
git commit -am "...",
git checkout master
git merge class-notes
