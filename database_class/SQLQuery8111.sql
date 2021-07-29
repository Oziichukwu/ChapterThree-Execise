select distinct buyer, department
from SKU_DATA
where sku in
	( select sku 
		from ORDER_ITEM
		where OrderNumber in 
			( select OrderNumber 
				from RETAIL_ORDER
				where OrderMonth = 'december' 
				and OrderYear = 2017));



