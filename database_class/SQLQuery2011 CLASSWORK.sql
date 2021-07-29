select * from WAREHOUSE
select * from INVENTORY

SELECT WAREHOUSE.WarehouseID, SKU, Manager, WarehouseState, QuantityOnHand 
FROM WAREHOUSE JOIN INVENTORY
ON WAREHOUSE.WarehouseID = INVENTORY.WarehouseID
WHERE QuantityOnHand > 0




