SELECT list.customer_id, list.first_name, list.last_name,COUNT(*) 
FROM ( 
	SELECT payment.customer_id,customer.first_name,customer.last_name 
	FROM payment
	JOIN customer ON payment.customer_id=customer.customer_id
) AS list								  
GROUP BY list.customer_id,list.first_name, list.last_name
ORDER BY COUNT(*) DESC;