@echo off
echo Starting Distributed Marketplace System...
echo.

echo Starting Marketplace...
start "Marketplace MP1" "C:\Program Files\Eclipse Adoptium\jdk-21.0.7.6-hotspot\bin\java.exe" -cp "target/distributed-marketplace-1.0-SNAPSHOT.jar" "marketplace.Marketplace" "MP1"

echo.
echo Starting Test Client...
timeout /t 3 /nobreak > nul
"C:\Program Files\Eclipse Adoptium\jdk-21.0.7.6-hotspot\bin\java.exe" -cp "target/distributed-marketplace-1.0-SNAPSHOT.jar" "marketplace.TestClient"

echo.
echo Demo completed!
pause 