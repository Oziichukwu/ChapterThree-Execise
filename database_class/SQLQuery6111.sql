
select * from SKU_DATA

select sum(ExtendedPrice) AS WaterSportsRevenue
from ORDER_ITEM
where SKU IN
	(select sku 
	from SKU_DATA
	where Department = 'camping');