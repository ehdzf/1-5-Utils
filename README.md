# Java utils

Goal: Use different Java utils classes to create, read and write files. Also serialize objects and store them in the filesystem.

## Level 1: File I/O
Package name: main.java.levelone

ℹ All tasks can be executed from both, the CLI or the IDE, if you are running from the ide, you will be promted to enter the desired path for the directory. For tasks one through four, you can specify the path as an argument when running the program as shown in the examples.

✅ Task one:

Main Class name: TaskOne

**Goal**: given a path to a directory, list all files and directories in that directory.

```bash
java src/main/java/levelone/TaskOne.java <path>
```
✅ Task task two:

Main Class name: TaskTwo

**Goal**: given a path to a directory, list all files and directories in that directory and its subdirectories, recursively.

```bash
java src/main/java/levelone/TaskTwo.java <path>
```

✅ Task three:

Main Class name: TaskThree

**Goal**: given a path to a directory, list all files and directories in that directory and its subdirectories, recursively and save it to a file.
The file will ve stored at `storage/output.txt`

```bash
java src/main/java/levelone/TaskThree.java <path>
```

✅ Task four:

Main Class name: TaskFour

**Goal**: given a path to a text file, read the file's content and print it to the console. If no path is provided, the class will print the content of the file `src/main/resources/levelone/taskfour/lorem.txt`.

```bash
java src/main/java/levelone/TaskFour.java <path>
```
✅ Task five:

Main Class name: TaskFive

**Goal**: Serialize an object and store it in the filesystem. Then deserialize the object and print its content.
The file will ve stored at `storage/serialized.ser`
```bash
java src/main/java/levelone/TaskFive.java
```
## Level 2: global variables
Package name: main.java.leveltwo

**Goal**: Create an application.properties file and rerun task three from level one using a path and output filename specified in the properties file.

The file will be stored in `./output/level2.txt`

### Plugins:
- maven-jar-plugin
  - Used to set a specific entry class int the build jar file:
```xml 
<build>
  <plugins>
    <plugin>
      <artifactId>maven-jar-plugin</artifactId>
      <version>3.2.0</version>
      <configuration>
        <archive>
          <manifest>
            <mainClass>leveltwo.TaskOne</mainClass>
          </manifest>
        </archive>
      </configuration>
    </plugin>
  </plugins>
</build>
```

✅ Task one:


`
leveltwo.TaskOne
`

```bash
java -jar target/utils-1.0-SNAPSHOT.jar
```