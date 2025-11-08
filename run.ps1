<#
Run helper for compiled classes.
Usage: .\run.ps1 -Main ProblemOne
Optional: pass extra args after -Args
#>

param(
    [string]$Main = 'ProblemOne',
    [Parameter(ValueFromRemainingArguments=$true)]
    [string[]]$Args
)

$bin = Join-Path $PSScriptRoot 'bin'
if (-not (Test-Path $bin)) {
    Write-Error "bin directory not found. Run build.ps1 first."
    exit 1
}

Write-Host "Running $Main ..."
& java -cp $bin $Main @Args
