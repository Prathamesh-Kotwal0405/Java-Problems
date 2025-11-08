# Java-Problems — Build & Run

This small collection of Java practice programs can be built and run with a JDK on Windows (PowerShell). The repo contains many single-file classes (no build system by default).

Requirements
- JDK 8+ installed and `javac` / `java` available on PATH.

Build (simple / quick)
1. Open PowerShell in the project root: `d:\Java Coding Questions\Java-Problems`
2. Create `bin` and compile all .java files (non-recursive):

```powershell
New-Item -ItemType Directory -Path .\\bin -Force
javac -d .\\bin *.java
```

If your files use subfolders or packages (or you want to compile recursively), use:

```powershell
New-Item -ItemType Directory -Path .\\bin -Force
$files = Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName }
& javac -d .\\bin $files
```

Run
- After compilation, run a main class by its simple or fully-qualified name (if packages are used). Example running `ProblemOne`:

```powershell
java -cp .\\bin ProblemOne
```

Scripts
- `build.ps1` — convenience script that compiles all `.java` files recursively into `bin`.
- `run.ps1` — convenience script that runs a named main class from `bin`.

Troubleshooting
- If `javac` is not found, install a JDK and add its `bin` folder to your PATH.
- If classes have `package` statements, run with fully-qualified names (`com.example.Main`).

If you'd like, I can add a simple Gradle or Maven wrapper for IDE integration — tell me which you prefer.
