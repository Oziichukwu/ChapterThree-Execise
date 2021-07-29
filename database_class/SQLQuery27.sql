-- class work --


select * from INVENTORY

select WarehouseID, count(QuantityOnOrder) as Goodnews
from INVENTORY
where QuantityOnOrder > 0 
Group by WarehouseID


