select sku 
		from ORDER_ITEM
		where OrderNumber in 
			( select OrderNumber 
				from RETAIL_ORDER
				where OrderMonth = 'january' 
				and OrderYear = 2018)