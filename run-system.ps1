# Distributed Marketplace System Runner

Write-Host "Starting Distributed Marketplace System..." -ForegroundColor Green
Write-Host ""

# Set Java path
$javaPath = "C:\Program Files\Eclipse Adoptium\jdk-21.0.7.6-hotspot\bin\java.exe"
$jarPath = "target/distributed-marketplace-1.0-SNAPSHOT.jar"

# Start Marketplace
Write-Host "Starting Marketplace MP1..." -ForegroundColor Yellow
Start-Process -FilePath $javaPath -ArgumentList "-cp", $jarPath, "marketplace.Marketplace", "MP1" -NoNewWindow

# Wait for marketplace to start
Write-Host "Waiting for marketplace to start..." -ForegroundColor Cyan
Start-Sleep -Seconds 3

# Start Test Client
Write-Host "Starting Test Client..." -ForegroundColor Yellow
& $javaPath -cp $jarPath "marketplace.TestClient"

Write-Host ""
Write-Host "System test completed!" -ForegroundColor Green 