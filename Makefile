JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        CoolSort.java \
        Search.java \
        SelectionSort.java
 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class