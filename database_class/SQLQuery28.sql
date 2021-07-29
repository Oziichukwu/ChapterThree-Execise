select * from INVENTORY

-- CLASS WORK --
select CONCAT ('warehouse', warehouseID , 'HAS', COUNT (QuantityOnOrder), 'ORDERS') as REPORT
from INVENTORY
where QuantityOnOrder > 0 
Group by WarehouseID
