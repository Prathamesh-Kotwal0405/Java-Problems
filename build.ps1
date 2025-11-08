<#
Build script for the Java-Problems folder.
Usage: Open PowerShell in the project root and run:
    .\build.ps1
#>

$bin = Join-Path $PSScriptRoot 'bin'
if (-not (Test-Path $bin)) {
    New-Item -ItemType Directory -Path $bin | Out-Null
}

$files = Get-ChildItem -Path $PSScriptRoot -Recurse -Filter *.java | ForEach-Object { $_.FullName }
if (-not $files -or $files.Count -eq 0) {
    Write-Error "No .java files found under $PSScriptRoot"
    exit 1
}

Write-Host "Compiling $($files.Count) Java files to $bin ..."
& javac -d $bin $files
if ($LASTEXITCODE -ne 0) {
    Write-Error "javac failed with exit code $LASTEXITCODE"
    exit $LASTEXITCODE
}

Write-Host "Compilation succeeded. Classes are in $bin"
