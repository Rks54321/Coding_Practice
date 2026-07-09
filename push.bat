@echo off
cd /d %~dp0

git add .

set /p msg=Enter Commit Message:

git commit -m "%msg%"

git push origin main

pause