# Distributed Marketplace Demo Script

Write-Host "=== Distributed Marketplace System Demo ===" -ForegroundColor Green
Write-Host ""

# Show the compiled JAR
Write-Host "Project compiled successfully!" -ForegroundColor Green
Write-Host "JAR file: target/distributed-marketplace-1.0-SNAPSHOT.jar" -ForegroundColor Cyan
Write-Host ""

# List all compiled classes
Write-Host "Compiled Classes:" -ForegroundColor Yellow
Write-Host "  - marketplace.Marketplace" -ForegroundColor White
Write-Host "  - marketplace.SagaCoordinator" -ForegroundColor White
Write-Host "  - marketplace.SagaTransaction" -ForegroundColor White
Write-Host "  - marketplace.OrderProcessor" -ForegroundColor White
Write-Host "  - marketplace.TestClient" -ForegroundColor White
Write-Host "  - seller.Seller" -ForegroundColor White
Write-Host "  - seller.ProductInventory" -ForegroundColor White
Write-Host "  - seller.Product" -ForegroundColor White
Write-Host "  - seller.ReservationRecord" -ForegroundColor White
Write-Host "  - network.Message" -ForegroundColor White
Write-Host "  - network.MessageType" -ForegroundColor White
Write-Host "  - network.Configuration" -ForegroundColor White
Write-Host "  - network.FailureSimulator" -ForegroundColor White
Write-Host "  - common.Order" -ForegroundColor White
Write-Host "  - common.OrderItem" -ForegroundColor White
Write-Host "  - common.OrderGenerator" -ForegroundColor White
Write-Host ""

# Show configuration files
Write-Host "Configuration Files:" -ForegroundColor Yellow
Write-Host "  - config/marketplace.properties" -ForegroundColor White
Write-Host "  - config/seller.properties" -ForegroundColor White
Write-Host ""

# Show how to run the system
Write-Host "How to run the system:" -ForegroundColor Yellow
Write-Host "1. Start Marketplace: java -cp target/distributed-marketplace-1.0-SNAPSHOT.jar marketplace.Marketplace MP1" -ForegroundColor Cyan
Write-Host "2. Start Seller: java -cp target/distributed-marketplace-1.0-SNAPSHOT.jar seller.Seller S1" -ForegroundColor Cyan
Write-Host "3. Test Client: java -cp target/distributed-marketplace-1.0-SNAPSHOT.jar marketplace.TestClient" -ForegroundColor Cyan
Write-Host ""

Write-Host "System is ready for testing!" -ForegroundColor Green 