select product_name from netology2.orders
join customers c on c.id = orders.customer_id
where upper(c.name) = upper (name);