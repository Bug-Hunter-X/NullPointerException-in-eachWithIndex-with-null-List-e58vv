```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.eachWithIndex { String item, int index ->
      println "Item $index: $item"
    }
  } else {
    println "The list is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])
```