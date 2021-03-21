# gradle-conflicting-dependencies-example

In an attempt to break a single large repo of 400 java, 1000 kotlin classes into a multi-module project, i came across

`Cannot access class 'Currency'. Check your module classpath for missing or conflicting dependencies`

explaination for solution:
https://stackoverflow.com/questions/35650045/how-to-enable-enum-inheritance

p.s minecraft modded did some clever stuff to change enums but lets try to stick to the java lang spec. https://stackoverflow.com/a/59918808/10078245
