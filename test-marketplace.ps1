# Test script for Distributed Marketplace System

Write-Host "Starting Distributed Marketplace Test..." -ForegroundColor Green

# Start Marketplace in background
Write-Host "Starting Marketplace..." -ForegroundColor Yellow
Start-Process -FilePath "java" -ArgumentList "-cp", "target/distributed-marketplace-1.0-SNAPSHOT.jar", "marketplace.Marketplace", "MP1" -NoNewWindow

# Wait a moment for marketplace to start
Start-Sleep -Seconds 2

# Test with a simple order
Write-Host "Sending test order..." -ForegroundColor Yellow
$order = @{
    orderId = "TEST-001"
    customerId = "C1234"
    items = @(
        @{ productId = "P1"; quantity = 2 },
        @{ productId = "P2"; quantity = 1 }
    )
} | ConvertTo-Json

# Send order via ZeroMQ (using a simple test client)
Write-Host "Order JSON: $order" -ForegroundColor Cyan

Write-Host "Test completed. Check the marketplace output above." -ForegroundColor Green
Write-Host "Press any key to exit..." -ForegroundColor Gray
$null = $Host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown") 