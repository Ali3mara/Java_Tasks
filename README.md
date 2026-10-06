# Java_Tasks

Java EE course work.

- `lectures/lecNN/taskX/` – lecture tasks, one folder per task, each with its own `Main` (package `lectures.lecNN.taskX`).
- `projects/<name>/` – larger projects, each a self-contained Maven project (`src/main/java`, `src/test/java`).

## Running a lecture task
From the repo root:
```
javac -d out lectures/lec04/taskA/*.java
java -cp out lectures.lec04.taskA.Main
```
